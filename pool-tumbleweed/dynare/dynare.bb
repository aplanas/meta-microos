SUMMARY = "A platform for handling a wide class of economic models"
DESCRIPTION = "Dynare is a software platform for handling a wide class of economic models, in \
particular dynamic stochastic general equilibrium (DSGE) and overlapping \
generations (OLG) models."
LICENSE = "GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "dynare-5.4-1.1.aarch64.rpm"
RPM_HASH = "aa49a93cb0df77b465dcdad11f8ccb196cbe608ef21789e5ead12813a411dc0243a230a8605176e5f7b18107d93a1b9b218a6b7ee0e7581a760b8d50c21b656a"

RPROVIDES:${PN} += "dynare \
dynare(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgomp.so.1()(64bit) \
libgsl.so.27()(64bit) \
libm.so.6()(64bit) \
libmatio.so.11()(64bit) \
libopenblas.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libumfpack.so.5()(64bit)"

inherit rpm
