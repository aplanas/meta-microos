SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "102.12.0"

RPM_NAME = "libmozjs-102-0-102.12.0-1.1.aarch64.rpm"
RPM_HASH = "7839d050bf6e765adf31a084d0f921b8fc643811cbac8e0499077b91b92d466d129297022cefa258dc532fac7e25c5fbf90223a39e648e6e6cf66686f791460e"

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
