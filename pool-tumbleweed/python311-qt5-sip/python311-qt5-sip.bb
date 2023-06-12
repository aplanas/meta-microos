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

RPM_NAME = "python311-qt5-sip-12.12.1-1.1.aarch64.rpm"
RPM_HASH = "5cb2e8d3b71d8326d50cbe116aac427394404adea0295f183109649c476736ab4f8128a9b0d3db88199f6925d6be29f9ac68df19374b882a93275360a53ad20b"

RPROVIDES:${PN} += "python3.11dist(pyqt5-sip) \
python311-PyQt5-sip \
python311-qt5-sip \
python311-qt5-sip(aarch-64) \
python3dist(pyqt5-sip)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm