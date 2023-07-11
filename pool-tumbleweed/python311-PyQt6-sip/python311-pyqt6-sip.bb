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

RPM_NAME = "python311-PyQt6-sip-13.5.1-2.3.aarch64.rpm"
RPM_HASH = "5e1180ea9fba7fb4286336421d433cf6f8071cd1335e20ec16dffe1ca9db751645482d327cc1dc156a89dd103b1d8dcba82d07d746f7b11d6cb871d2adec170b"

RPROVIDES:${PN} += "python3-PyQt6-sip \
python3.11dist-pyqt6-sip \
python311-PyQt6-sip \
python3dist-pyqt6-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
