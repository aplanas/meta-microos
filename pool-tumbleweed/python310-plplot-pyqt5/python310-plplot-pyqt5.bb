SUMMARY = "PLplot functions for scientific plotting with python-qt5"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with python-qt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "python310-plplot-pyqt5-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "a1f786bbb9a78fdebd5407fe11b745ae1fc0b76061341a0bfe7a704f7465af35700757d188c0db6eefc0660032198e667d9878dd57c3aead18e7537a66117e7f"

RPROVIDES:${PN} += "plplot-python3-qt \
python310-plplot-pyqt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libplplotqt.so.2 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
plplot-common \
python-abi \
python310-qt5"

inherit rpm
