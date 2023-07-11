SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-objc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "085a671a1827db65705b2d1bc2ddef56dc86489867ba411f4168881cbb66359bb89b50440b08f999ab50966c444c4aa2612f9d7c908e2e837ed4707ce80a7a0c"

RPROVIDES:${PN} += "mingw64-gcc-objc \
mingw64-lib-objc"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
