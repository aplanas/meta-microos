SUMMARY = "Command line tools for use with framecpp"
DESCRIPTION = "This package provides command line tools  for use with framecpp."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-utils-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "a8c9ea2a516b54e38f7524eea2937e69889a1df63aecf9624c59afc4df41e03dd2da2df466dff69c9026101aae6ee26e3a2bcd2dcb2d970919a276294b7c5d83"

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
