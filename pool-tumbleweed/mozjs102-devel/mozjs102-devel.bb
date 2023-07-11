SUMMARY = "Development files and tools for mozjs102"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "102.12.0"

RPM_NAME = "mozjs102-devel-102.12.0-1.1.aarch64.rpm"
RPM_HASH = "41890724ee35d79aad1fa8ee01bd5a5e846a86689a6a2555c7d5d8e357b5af287b127faae692cc218389abcdfbb6c5f66f1214789b6f48d7b7a562c564f4ceb3"

RPROVIDES:${PN} += "mozjs102-devel \
pkgconfig-mozjs-102"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-102-0 \
pkgconfig"

inherit rpm
