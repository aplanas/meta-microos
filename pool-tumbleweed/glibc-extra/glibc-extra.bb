SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-extra-2.37-5.1.aarch64.rpm"
RPM_HASH = "745ba1c03c1892dd3f809e316ba70778034c11d2cac1cd3f03247352d931095b9001bc103fd52cd4ca8f4c4b3dc84575c336ea615e542c9924fb14138aee031a"

RPROVIDES:${PN} += "glibc-extra"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
