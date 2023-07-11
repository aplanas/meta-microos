SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python310-pyqtgraph-0.13.3-1.1.noarch.rpm"
RPM_HASH = "e85fb17422b2a366d15305f29b2fdeafed40b1b83ce54837766b879c03a0fae4d7e512610d0d14514d0220f49d837cc82d53d33fd7028eb40e70db6e89861285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyqtgraph \
python310-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
