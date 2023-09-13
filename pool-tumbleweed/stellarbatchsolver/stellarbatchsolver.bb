SUMMARY = "Batch images solver based on stellarsolver"
DESCRIPTION = "Tool that one could use to automatically solve, extract, and export a large number of images. \
This program is primarily meant for data reduction, but could also be used as a test for the library."
LICENSE = "GPL-3.0-or-later"

PV = "2.5"

RPM_NAME = "stellarbatchsolver-2.5-1.1.aarch64.rpm"
RPM_HASH = "8c897c28d6c5edc70b8c1baf4ecf752a58b8024c938ba85ab4b8ca7f78a2b08258bf11a83e7077a8b6c43b72ccf1ac63a7729b5e3ce8e7db44c51df61a745912"

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
