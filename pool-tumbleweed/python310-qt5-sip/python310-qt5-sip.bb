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

RPM_NAME = "python310-qt5-sip-12.12.1-1.1.aarch64.rpm"
RPM_HASH = "86411f99c337f55056ea52428809aaabe0dd1fd5a16e4fb23ce78eb8189fb8f9c0259b27ff1fe7391885874144933276c457e94e6816b1e26a984a18ae07f9a6"

RPROVIDES:${PN} += "python3-PyQt5-sip \
python3-qt5-sip \
python3.10dist-pyqt5-sip \
python310-PyQt5-sip \
python310-qt5-sip \
python3dist-pyqt5-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
