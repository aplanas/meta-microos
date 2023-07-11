SUMMARY = "Graphical effect and filter library for Qt5"
DESCRIPTION = "libqimageblitz5 is a graphical effect and filter library for Qt5 \
that contains many improvements over KDE 3.x's kdefx library \
including bugfixes, memory and speed improvements, and MMX/SSE \
support."
LICENSE = "BSD-2-Clause"

PV = "0.0.6+svn1515099"

RPM_NAME = "libqimageblitz5-1-0.0.6+svn1515099-4.14.aarch64.rpm"
RPM_HASH = "7605625c61531a9940830d098d4e4f4f74606967599043711b22a35a4efb80d77b1c1d7ed616ca93eaed23900d113bcd24c6632ccfc463c28f76dde8662c74fd"

RPROVIDES:${PN} += "libqimageblitz5-1 \
libqimageblitz5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
