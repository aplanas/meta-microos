SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python311-pyqtgraph-0.13.3-2.1.noarch.rpm"
RPM_HASH = "13e6fe3ddc145ca8756266e6a2ea7e16193bde8266fd9300173c8ba80dfbf5e0b5e742f39396953fe8bedcd291205515a4ccb6d34d3251f5bbc537d545e15f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyqtgraph \
python3.11dist-pyqtgraph \
python311-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
