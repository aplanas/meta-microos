SUMMARY = "Distributed version control system based on a theory of patches"
DESCRIPTION = "Pijul is a distributed version control system. Its distinctive feature is to be \
based on a theory of patches, which makes it really distributed."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.5"

RPM_NAME = "pijul-1.0.0~beta.5-1.2.aarch64.rpm"
RPM_HASH = "71a4e9ab516940e02dd7e761548075c166a9d85331bcfc773b56af61efd3d13d39a71ece173339a7ee108813a4a5da222c5886db5186ffe2069d2bb335659b3d"

RPROVIDES:${PN} += "pijul"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
