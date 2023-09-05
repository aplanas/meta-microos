SUMMARY = "Development files and tools for mozjs115"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "115.1.0"

RPM_NAME = "mozjs115-devel-115.1.0-1.2.aarch64.rpm"
RPM_HASH = "184a782774a9761c72c93cef0621af9fcf953217006dd5e535a18677206103f288a543fb8de84aaced76ff3e88d8e609d0e7b3ae01b10d79286c95a1d66ce4a3"

RPROVIDES:${PN} += "mozjs115-devel \
pkgconfig-mozjs-115"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-115-0 \
pkgconfig"

inherit rpm
