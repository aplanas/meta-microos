SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python39-pycdio-2.1.1-1.7.aarch64.rpm"
RPM_HASH = "5cf059af90efcbe6b9df5c58260055850924eaf8ed24cb7539a819f93d40ce64f1fdde1134d8cc96d847016345004086242cce38eb3a3576a0a6d624f4132dc5"

RPROVIDES:${PN} += "python3.9dist-pycdio \
python39-pycdio \
python3dist-pycdio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
python-abi"

inherit rpm
