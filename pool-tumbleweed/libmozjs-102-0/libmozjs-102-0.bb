SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "102.15.0"

RPM_NAME = "libmozjs-102-0-102.15.0-1.1.aarch64.rpm"
RPM_HASH = "3b9981547c9fc66d6f42720ad0d41c890ba14ef6ff060c7e5c1fea0c7cfa32981b91de0545a6914b4619ac5aad00d61efae617f1fe2805d7c4151ed1fc4cfce0"

RPROVIDES:${PN} += "libmozjs-102-0 \
libmozjs-102.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
