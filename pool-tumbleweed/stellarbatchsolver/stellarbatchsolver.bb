SUMMARY = "Batch images solver based on stellarsolver"
DESCRIPTION = "Tool that one could use to automatically solve, extract, and export a large number of images. \
This program is primarily meant for data reduction, but could also be used as a test for the library."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "stellarbatchsolver-2.4-2.3.aarch64.rpm"
RPM_HASH = "c28c15826d66d6bc5b56c4986d8f6f6d7738e8377facba13b620d4618b87b0a2cc6dfa233c6c7d6a72bc1f20d0b627a0685821ccef11c8740ecd84393bd76de1"

RPROVIDES:${PN} += "stellarbatchsolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libstellarsolver.so.2"

inherit rpm
