SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python310-pycdio-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "ca3179c263547dfe4d44883beda8b202060b6048b44f3d71b1d0688a19955d7270dd6c534c79d7eed7cbc377d6ea22d299931fd14afb975adbb650a18cc6e1ac"

RPROVIDES:${PN} += "python3-pycdio \
python3.10dist-pycdio \
python310-pycdio \
python3dist-pycdio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
python-abi"

inherit rpm
