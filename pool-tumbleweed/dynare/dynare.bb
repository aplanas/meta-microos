SUMMARY = "A platform for handling a wide class of economic models"
DESCRIPTION = "Dynare is a software platform for handling a wide class of economic models, in \
particular dynamic stochastic general equilibrium (DSGE) and overlapping \
generations (OLG) models."
LICENSE = "GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "dynare-5.4-1.2.aarch64.rpm"
RPM_HASH = "ffc67957ab7057c8a155e16f2fcc21b79655897023a9453717330a159d5abb798a9e626734d5bdf07944d2a08fe9b737c86dddf0a66725cc72f451761347c992"

RPROVIDES:${PN} += "dynare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
libgsl.so.27 \
libm.so.6 \
libmatio.so.11 \
libopenblas.so.0 \
libstdc++.so.6 \
libumfpack.so.5"

inherit rpm
