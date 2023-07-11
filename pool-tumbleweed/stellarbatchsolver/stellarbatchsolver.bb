SUMMARY = "Batch images solver based on stellarsolver"
DESCRIPTION = "Tool that one could use to automatically solve, extract, and export a large number of images. \
This program is primarily meant for data reduction, but could also be used as a test for the library."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "stellarbatchsolver-2.4-2.4.aarch64.rpm"
RPM_HASH = "7b421b6e49bfe9f8dfef14153d5c24bd1f8e20e398a43372aa87d230dddf90f0d18bd3e9bb8a811dbad6c2d840175691b8ae98ce33fbf905609b1650501f7495"

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
