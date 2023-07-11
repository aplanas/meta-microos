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

RPM_NAME = "liblognorm5-2.0.6-2.18.aarch64.rpm"
RPM_HASH = "6ba2baf206c1f067c47c541ac4aa4c34597ab8043f44289debca6e8bd0d2dc36b6d38501e789127b67a884cb8e51805626bcbce2247e3ac1e040434dfc2ad656"

RPROVIDES:${PN} += "liblognorm.so.5 \
liblognorm5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libestr.so.0 \
libfastjson.so.4 \
libpcre.so.1"

inherit rpm
