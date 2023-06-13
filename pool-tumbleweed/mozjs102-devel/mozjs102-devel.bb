SUMMARY = "Development files and tools for mozjs102"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "102.11.0"

RPM_NAME = "mozjs102-devel-102.11.0-1.2.aarch64.rpm"
RPM_HASH = "215afff6899eb5d746f1773ac090d0e8809d204f1558f95c95f59794dadd06efd4fa409b85ddf78ae1de6f07bfe1723abecb430b2912aafa688206af2b3a4a25"

RPROVIDES:${PN} += "mozjs102-devel \
mozjs102-devel(aarch-64) \
pkgconfig(mozjs-102)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-102-0 \
pkgconfig"

inherit rpm
