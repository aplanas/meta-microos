SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-extra-2.37-4.4.aarch64.rpm"
RPM_HASH = "ce07e99d95e786a8c5d7d02bbc5ace87e0f32e58414c3515f695d2aff0a6a76effc6e2f7bc62e13a99aa3ef601475d7e2e9646f69714380bcaac1747e9ef0d5b"

RPROVIDES:${PN} += "glibc-extra"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
