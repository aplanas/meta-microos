SUMMARY = "Development files for the zn_poly library"
DESCRIPTION = "zn_poly is a C library for polynomial arithmetic in Z/nZ[x], where n \
is any modulus that fits into an unsigned long."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "zn_poly-devel-0.9.2-2.11.aarch64.rpm"
RPM_HASH = "0ef15d74b0985a1d828362112e48fa1e6f82b05a800ec80a624e7ede79432ca77e8097069bb95c6d40308ead41d49f67a8c155e198b994f4a1fe48babca07f3b"

RPROVIDES:${PN} += "zn-poly-devel"

RDEPENDS:${PN} += "libzn-poly-0-9"

inherit rpm
