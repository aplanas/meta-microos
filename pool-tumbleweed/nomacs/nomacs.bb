SUMMARY = "Lightweight image viewer"
DESCRIPTION = "nomacs is a free image viewer, which is small, fast and able to handle the \
most common image formats. Additionally it is possible to synchronise \
multiple viewers. A synchronisation of viewers running on the same \
computer or via LAN is possible. It allows to compare images and spot the \
differences (e.g. schemes of architects to show the progress)."
LICENSE = "GPL-3.0-or-later"

PV = "3.16.224"

RPM_NAME = "nomacs-3.16.224-2.22.aarch64.rpm"
RPM_HASH = "00fbdc11a790bdfc8826bb64c244d4e2ab2e596c9f06be9796b802980e0c6946c4366881072860482d70662d43897663879b4f6a5cac3906c62d4992f176b159"

RPROVIDES:${PN} += "libnomacsCore.so.3 \
nomacs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libquazip1-qt5.so.1.4.0 \
libraw.so.23 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
