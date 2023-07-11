SUMMARY = "PLplot functions for scientific plotting with python-qt5"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with python-qt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "python39-plplot-pyqt5-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "164547770c3f6f0cb3f7b0424a38125e0a7697d5cd4cdd8c1fd57c9e518d34b07814ee26f4265628f3f0d13113a41e7fea3e8a0f92bdb189c85fabe6ec41a98d"

RPROVIDES:${PN} += "python39-plplot-pyqt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libplplotqt.so.2 \
libpython3.9.so.1.0 \
libstdc++.so.6 \
plplot-common \
python-abi \
python39-qt5"

inherit rpm
