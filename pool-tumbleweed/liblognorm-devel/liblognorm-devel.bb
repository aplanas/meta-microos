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

RPM_NAME = "liblognorm-devel-2.0.6-2.17.aarch64.rpm"
RPM_HASH = "60bba3b994443b5d8e5768781aecdd4515ed3d2c70b37034caffdb8ed2616746f35b880d2796bcef6e2410054eb83398e4b8ffaa1ed1894ded4a58c03af7cd52"

RPROVIDES:${PN} += "liblognorm-devel \
liblognorm-devel(aarch-64) \
pkgconfig(lognorm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblognorm5 \
pkgconfig(libfastjson)"

inherit rpm
