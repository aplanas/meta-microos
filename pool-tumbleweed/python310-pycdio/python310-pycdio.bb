SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python310-pycdio-2.1.1-1.7.aarch64.rpm"
RPM_HASH = "55d0a026e2914bc58564565de8e47ca3f82dcf862be4a7d67770ccf6ea966d46e886c77cdff8ac926951d418b3f298bc7fee43c6172a5fe76dff37d30f93ae24"

RPROVIDES:${PN} += "python3.10dist-pycdio \
python310-pycdio \
python3dist-pycdio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
python-abi"

inherit rpm
