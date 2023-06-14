SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-extra-2.37-4.1.aarch64.rpm"
RPM_HASH = "c7ec678f1fd3eaf0bc34c2ad7e31fc054dfc8ed0f7631b7deddc16f20c561f1e91438f3f3c679b7f4e5e4eb8f9394dca503cbbf2e564e72dc2db8b8124a510b1"

RPROVIDES:${PN} += "glibc-extra"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
