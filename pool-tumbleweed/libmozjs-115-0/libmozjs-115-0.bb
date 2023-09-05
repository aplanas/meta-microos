SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "115.1.0"

RPM_NAME = "libmozjs-115-0-115.1.0-1.2.aarch64.rpm"
RPM_HASH = "4ec41a7228c98d58c1bee0343cc7ea1d314ce3a668e28e9d765f38db3583061c212345034d3d2ace410cd073617b214a1b37e4987dd71fcea2b96a61140d511b"

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
