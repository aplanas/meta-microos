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

RPM_NAME = "python311-PyQt6-sip-13.5.1-1.1.aarch64.rpm"
RPM_HASH = "dde54b5923db621114e48abb343cabec08b4f2d8a8c4a5cb79508e5844148b2529e5f26483c49b38811586124a467f8810b5752842bd1bc8aad91dc36f4c1ce4"

RPROVIDES:${PN} += "python3.11dist-pyqt6-sip \
python311-PyQt6-sip \
python3dist-pyqt6-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
