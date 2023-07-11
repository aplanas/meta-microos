SUMMARY = "The sip module support for PyQt5"
DESCRIPTION = "The sip extension module provides support for the PyQt5 package. \
 \
SIP is a tool that makes it very easy to create Python bindings for \
C and C++ libraries. It was originally developed to create PyQt, \
the Python bindings for the Qt toolkit, but can be used to create \
bindings for any C or C++ library. For example, it is also used to \
create wxPython, the Python bindings for the wxWidget toolkit."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "12.12.1"

RPM_NAME = "python311-qt5-sip-12.12.1-2.3.aarch64.rpm"
RPM_HASH = "7597335ed4eec2a5ccd4c4479626b3cb0ae034729a3d17ea65b063f4bcea3ae2524474e6644edae7d2e2e1c2b1690f970cb8a02273f001a7b0ab591b8ef340e2"

RPROVIDES:${PN} += "python3-PyQt5-sip \
python3-qt5-sip \
python3.11dist-pyqt5-sip \
python311-PyQt5-sip \
python311-qt5-sip \
python3dist-pyqt5-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
