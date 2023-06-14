SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with \
huge numbers (integer and floating point)."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "gmp-devel-6.2.1-4.14.aarch64.rpm"
RPM_HASH = "8e5cec37dc93f4f095fd7d257c54d771494b00b25f34cdbe7071035046c2dad2821137e646b23e34df5a9a91b0e2f77e748c6bf61d9c7d412fa2d9f2ff8dcfcb"

RPROVIDES:${PN} += "gmp-devel \
pkgconfig-gmp \
pkgconfig-gmpxx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libgmp10 \
libgmpxx4 \
pkgconfig-gmp"

inherit rpm
