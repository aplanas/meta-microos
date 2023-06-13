SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python39-pycdio-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "d98df96dd2e1cb7ffd28c2ece5d4d2591a9286fb9ae2eeb553d8450cc388d7555d62693ce413cf6afcbf2c5e2c27a52fa8e2f2b1e91a3aad18f04f8de2556166"

RPROVIDES:${PN} += "python3.9dist(pycdio) \
python39-pycdio \
python39-pycdio(aarch-64) \
python3dist(pycdio)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libiso9660.so.11()(64bit) \
libiso9660.so.11(ISO9660_11)(64bit) \
python(abi)"

inherit rpm
