SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "libmozjs-78-0-78.15.0-2.8.aarch64.rpm"
RPM_HASH = "3caba36d00603a35b907d8001b4e390fa7501df07bee9ddb4ae61ffd176b31bd95a429d0bfcef8da83ba4e666f25083031b44edb0d40a4a9fb226a34d449a0a0"

RPROVIDES:${PN} += "libmozjs-78-0 \
libmozjs-78-0(aarch-64) \
libmozjs-78.so.0()(64bit) \
libmozjs-78.so.0(mozjs_78)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
