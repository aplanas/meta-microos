SUMMARY = "A library which provides the glue between Coin and Qt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libSoQt20-1.6.0-2.9.aarch64.rpm"
RPM_HASH = "76d34b01a260f07d01b267f81f4f229a4f7d6c534c73910d8f2c58bcd8daea182ca9e5325f7ac0cc1b55c19ddf1917b425957a6d906ef730e52e33c7af8b5416"

RPROVIDES:${PN} += "libSoQt.so.20 \
libSoQt20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
