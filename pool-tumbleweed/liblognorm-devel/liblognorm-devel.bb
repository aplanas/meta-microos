SUMMARY = "Development files for liblognorm"
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
analysis tool. \
 \
The liblognorm-devel package contains libraries and header files for \
developing applications that use liblognorm."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "2.0.6"

RPM_NAME = "liblognorm-devel-2.0.6-2.18.aarch64.rpm"
RPM_HASH = "97514b9a3f8127011300e1549bcf535fb746aaa0f37667c00ed6b3a10421781c2833d15b6b2bfd1ad775b570b4fc486e63751834cf47c341d315fb4051a18c87"

RPROVIDES:${PN} += "liblognorm-devel \
pkgconfig-lognorm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblognorm5 \
pkgconfig-libfastjson"

inherit rpm
