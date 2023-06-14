SUMMARY = "Scientific Graphics and GUI Library for Python"
DESCRIPTION = "A pure-Python graphics library for PyQt/PySide/PyQt5/PySide2 \
 \
PyQtGraph is intended for use in mathematics / scientific / engineering \
applications. It is written in pure python, but the library leverages \
numpy for number crunching, Qt's GraphicsView framework for 2D display, \
and OpenGL for 3D display."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "python38-pyqtgraph-0.12.4-1.2.noarch.rpm"
RPM_HASH = "5d7ffb2019bb7b9089bdd9a90c0dfea7ce361933605e38bf53ce48e7a588830bb5fb0e76449a29ff9c2544a169e638b39264dfb22c759267e3f6695ee70ade08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-pyqtgraph \
python38-pyqtgraph \
python3dist-pyqtgraph"

RDEPENDS:${PN} += "python-abi \
python38-numpy"

inherit rpm
