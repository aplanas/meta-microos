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

RPM_NAME = "python310-qt5-sip-12.12.1-2.3.aarch64.rpm"
RPM_HASH = "7425cdf7af69b25f768f7254f2b6c1d7219fce97cc82f6e8d27a1d4e74e637da8209dd6ee22d1e40a24f3415328f59941c9cfe67e423a99613af2f62aa7b202d"

RPROVIDES:${PN} += "python3.10dist-pyqt5-sip \
python310-PyQt5-sip \
python310-qt5-sip \
python3dist-pyqt5-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
