SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "115.2.0"

RPM_NAME = "libmozjs-115-0-115.2.0-1.1.aarch64.rpm"
RPM_HASH = "fe9daa24221a5b82f542e1f4216350abf1ecdfe0257e8501743fc44827044c0531e4c38494c8eee4486b2c063ac2ade62db9781307119828f65f81c2f494654a"

RPROVIDES:${PN} += "libmozjs-115-0 \
libmozjs-115.so.0"

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
