SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC multiple-precision complex library development files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "mpc-devel-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "3a3c4c43d6a0f96d526622f180e05a7567d82d555305c4a030f9ec43fdd0e37d6b3f09b41ea4ac3fa5848f52c4f76c06c23e3d96e5a91f097ae47a5ee90d3ac2"

RPROVIDES:${PN} += "mpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libmpc3 \
pkgconfig-gmp \
pkgconfig-mpfr"

inherit rpm
