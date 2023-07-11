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

RPM_NAME = "python310-PyQt6-sip-13.5.1-2.3.aarch64.rpm"
RPM_HASH = "effc4838f8581a9937498c65fb9d34bba52ed85cfa2558180503f4ffa6189e87a9715729093cd6ed45fdb2bec0e09eaf34ed07a29ae3196c2c014be54fdcd364"

RPROVIDES:${PN} += "python3.10dist-pyqt6-sip \
python310-PyQt6-sip \
python3dist-pyqt6-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
