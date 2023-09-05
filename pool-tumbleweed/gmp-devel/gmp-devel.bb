SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with \
huge numbers (integer and floating point)."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "gmp-devel-6.3.0-2.1.aarch64.rpm"
RPM_HASH = "f1f43f29f7c8ca65ed2e5f93056bbc57ee70d6358e4e9f3b432de1f65f16abfb476579b1f75d2ca1fa3d7e401988f951c6a97fcc72a93000acddbfa76be84ac6"

RPROVIDES:${PN} += "gmp-devel \
pkgconfig-gmp \
pkgconfig-gmpxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgmp10 \
libgmpxx4 \
pkgconfig-gmp"

inherit rpm
