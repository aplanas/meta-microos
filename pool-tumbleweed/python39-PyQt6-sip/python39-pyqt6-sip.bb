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

RPM_NAME = "python39-PyQt6-sip-13.5.1-2.3.aarch64.rpm"
RPM_HASH = "fd4aaa97d187ab7ca81738c982102df09c28ce449d2a7a73e94696cb8379a3c033c1e80bd6ba2fef8f6a7df0358b0569709ccb369ee7fc9b35ba5fb3b4f80c72"

RPROVIDES:${PN} += "python3.9dist-pyqt6-sip \
python39-PyQt6-sip \
python3dist-pyqt6-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
