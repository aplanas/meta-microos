SUMMARY = "Complex Textlayout Library"
DESCRIPTION = "Library that encapsulates the logic for complex \
text layout and provides a convenient API."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "libraqm0-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "bf63bc6f6430f797736d0a523b91c75887fee4ce45067e2b56991f2f019e81ac0e3b1068f83a28e911786a6ed19655180253b74a4e41a6ade949764d229b6883"

RPROVIDES:${PN} += "libraqm.so.0 \
libraqm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libfribidi.so.0 \
libharfbuzz.so.0"

inherit rpm
