SUMMARY = "Development files and tools for mozjs78"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "mozjs78-devel-78.15.0-3.1.aarch64.rpm"
RPM_HASH = "8a2f36ad54190289f9245dd039c1591aa608b273a8b87acbc2fbe76faf7b6ae5b875e7dd43dc608fbacabf6dc6ec970f8e1eb6e30a23a7a400c1436a2b0bab66"

RPROVIDES:${PN} += "mozjs78-devel \
pkgconfig-mozjs-78"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-78-0 \
pkgconfig"

inherit rpm
