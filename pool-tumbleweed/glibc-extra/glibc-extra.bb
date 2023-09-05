SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.38"

RPM_NAME = "glibc-extra-2.38-2.1.aarch64.rpm"
RPM_HASH = "02d7eab0ce56145203dfc8d31ed05fac1cfe8b823b6515925bcba31a727c7ce02193f5fc4f41efeda6e3fdb8e696d2926896ed9f07d92d1db7e1658c7e5e3c5a"

RPROVIDES:${PN} += "glibc-extra"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
