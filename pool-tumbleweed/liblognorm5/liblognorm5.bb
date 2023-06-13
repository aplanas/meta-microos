SUMMARY = "Library and tool to normalize log data"
DESCRIPTION = "Liblognorm is a library and a tool to normalize log data. \
 \
Liblognorm shall help to make sense out of syslog data, or, actually, any event \
data that is present in text form. \
 \
In short words, one will be able to throw arbitrary log message to liblognorm, \
one at a time, and for each message it will output well-defined name-value \
pairs and a set of tags describing the message. \
 \
So, for example, if you have traffic logs from three different firewalls, \
liblognorm will be able to 'normalize' the events into generic ones. Among \
others, it will extract source and destination ip addresses and ports and make \
them available via well-defined fields. As the end result, a common log \
analysis application will be able to work on that common set and so this \
backend will be independent from the actual firewalls feeding it. Even better, \
once we have a well-understood interim format, it is also easy to convert that \
into any other vendor specific format, so that you can use that vendor's \
analysis tool."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "2.0.6"

RPM_NAME = "liblognorm5-2.0.6-2.17.aarch64.rpm"
RPM_HASH = "ed59586cbc3b31752aa5913279e717f1041a6fcb939272b7cc5e48a0183d69a5e5be33bd9deed7ec7769df1e1dae3e35e99e8de2c939f3e73e75f27770953463"

RPROVIDES:${PN} += "liblognorm.so.5()(64bit) \
liblognorm5 \
liblognorm5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libestr.so.0()(64bit) \
libfastjson.so.4()(64bit) \
libpcre.so.1()(64bit)"

inherit rpm
