SUMMARY = "MPC multiple-precision complex library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-libmpc3-1.0.2-3.1.noarch.rpm"
RPM_HASH = "2907541c1b74e2b7b89c3d11ca58642b5dae8780698bc698110d4f5b4187bcb521d9584fae1c90d693b5b95193e8e51406cf6e186d708e4f98451c17cf804bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libmpc-3.dll) \
mingw64-libmpc \
mingw64-libmpc3"
RDEPENDS:${PN} += "mingw64(libgmp-10.dll) \
mingw64(libmpfr-4.dll)"

inherit rpm
