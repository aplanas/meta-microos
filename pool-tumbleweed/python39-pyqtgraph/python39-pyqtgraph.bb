SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python39-pyqtgraph-0.13.3-2.1.noarch.rpm"
RPM_HASH = "4fbf05b0efdd8a5ecc2c4d162827650295f9117c8b682f4e84184b1c5bfd925ff7728b892ec2671c861eea4deb56c9cbd862f04d28852be7326a79a7995098c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyqtgraph \
python39-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
