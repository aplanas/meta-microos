SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python311-pycdio-2.1.1-1.7.aarch64.rpm"
RPM_HASH = "850e1fef9102e5ac0f9d8c82cea750c8b1b54f38c22534a2d320254af2edf4a966650d0ceff42375ef112a39cd7df0bc6ed21f8a83241204e311bfc3533d79d2"

RPROVIDES:${PN} += "python3-pycdio \
python3.11dist-pycdio \
python311-pycdio \
python3dist-pycdio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
python-abi"

inherit rpm
