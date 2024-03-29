SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "libmozjs-78-0-78.15.0-3.1.aarch64.rpm"
RPM_HASH = "61cc5c7934ad16a46c129c227e675b973b6fe9e929418a0f45d08931276363adf2268d24b3a5ebb33bfbd4f9be377022f681087c8662f4a0d7943cec6718efdf"

RPROVIDES:${PN} += "libmozjs-78-0 \
libmozjs-78.so.0"

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
