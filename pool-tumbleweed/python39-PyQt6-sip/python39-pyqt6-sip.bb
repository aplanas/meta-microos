SUMMARY = "The sip module support for PyQt6"
DESCRIPTION = "The sip extension module provides support for the PyQt6 package. \
 \
SIP is a tool for automatically generating Python bindings for \
C and C++ libraries. SIP was originally developed in 1998 for \
PyQt - the Python bindings for the Qt GUI toolkit - but is \
suitable for generating bindings for any C or C++ library. SIP \
can also be used write self contained extension modules, i.e. \
without a library to be wrapped."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "13.5.1"

RPM_NAME = "python39-PyQt6-sip-13.5.1-1.1.aarch64.rpm"
RPM_HASH = "3d8e4348f451ae3cdb344091786a6e2a3d7d8a859c1c379fe69514a58aff63f7bab4f991d0be33971ac9612a9e4a137c094c6d486ec4405f8ada99691bfb9144"

RPROVIDES:${PN} += "python3.9dist(pyqt6-sip) \
python39-PyQt6-sip \
python39-PyQt6-sip(aarch-64) \
python3dist(pyqt6-sip)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
