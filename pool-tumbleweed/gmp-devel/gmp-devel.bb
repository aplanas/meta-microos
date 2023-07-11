SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with \
huge numbers (integer and floating point)."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "gmp-devel-6.2.1-4.16.aarch64.rpm"
RPM_HASH = "44d36395ce97dcb78beb8e22e02fdf10fce926d4056aaef55b4e931169ea77f4e32df23cdf4b71fed31debf3f9ee9ad2ebd7c8f328b871ebbeefad065d98817f"

RPROVIDES:${PN} += "gmp-devel \
pkgconfig-gmp \
pkgconfig-gmpxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgmp10 \
libgmpxx4 \
pkgconfig-gmp"

inherit rpm
