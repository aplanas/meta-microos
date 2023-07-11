SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python311-pyqtgraph-0.13.3-1.1.noarch.rpm"
RPM_HASH = "9452e0ea4d08615ffd63cfa6d566f815cb93b06592f060c7dbad00765268bab9847559b2f56139a7cf70c5acb0245e68dca475a225f834680912ca9e946259fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyqtgraph \
python3.11dist-pyqtgraph \
python311-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
