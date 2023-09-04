SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "102.14.0"

RPM_NAME = "libmozjs-102-0-102.14.0-1.1.aarch64.rpm"
RPM_HASH = "90d2dccc4abad6a11a11715a7d9606912db6fb429aa7204b411f9da549539ed413aa5620db528a38c0d926bf93198d445c5e4a18323510707fc92bac3f76f867"

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
