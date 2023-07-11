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

RPM_NAME = "python39-qt5-sip-12.12.1-2.3.aarch64.rpm"
RPM_HASH = "e3eea0b3ad711d7e03aeed67dcd7990ee77615195abb918f01d1a3dd950728cb0d805eb50c05f3294fe5d48e9cb2b10ef9d07d6f03008ab4526243e518a37917"

RPROVIDES:${PN} += "python3.9dist-pyqt5-sip \
python39-PyQt5-sip \
python39-qt5-sip \
python3dist-pyqt5-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
