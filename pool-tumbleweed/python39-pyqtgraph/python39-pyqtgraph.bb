SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python39-pyqtgraph-0.13.3-1.1.noarch.rpm"
RPM_HASH = "fde075a9589fc8f42e622d2293abdb6f0bf02e53ed083d8963cf30701c4eaa84fef42ad7840dca130748ff47b4a711f715c9452cff75fb93ddc95341c52e0144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyqtgraph \
python39-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
