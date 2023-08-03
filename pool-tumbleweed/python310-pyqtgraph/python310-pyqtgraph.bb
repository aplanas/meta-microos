SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python310-pyqtgraph-0.13.3-2.1.noarch.rpm"
RPM_HASH = "5ca95fe4a1418d0dab4409d495b60f1710303f00a3f01222fc698df501e99b94f9196827d5bca9e361c09ddb67ca1a39ef8c0b8a276f8e3dbee5fdf06f61c4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyqtgraph \
python310-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
