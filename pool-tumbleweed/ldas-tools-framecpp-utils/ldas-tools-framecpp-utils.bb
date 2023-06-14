SUMMARY = "Command line tools for use with framecpp"
DESCRIPTION = "This package provides command line tools  for use with framecpp."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-utils-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "e2ca4865d3580fe0ad9f839ee230f05ef30e2eb343d57729b3ea2c26f82719fc268ff44fb5649be567e7b3ec78bac0db1b87a0bce7cfc199df012e24ceb62653"

RPROVIDES:${PN} += "ldas-tools-framecpp-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libframecpp.so.12 \
libframecpp3.so.6 \
libframecpp4.so.8 \
libframecpp6.so.8 \
libframecpp7.so.4 \
libframecpp8.so.7 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
