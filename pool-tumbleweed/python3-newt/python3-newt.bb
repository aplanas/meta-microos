SUMMARY = "Python 3 bindings for newt"
DESCRIPTION = "The python3-newt package contains the Python 3 bindings for the newt library \
providing a python API for creating text mode interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "python3-newt-0.52.23-2.2.aarch64.rpm"
RPM_HASH = "913d324c5f3044faf52ee4e82ea2c65c69e6904b4dccc2ef7dfe2e567be7e037adadaaff7adc94d37d5e1a983333dbc77e940029bb857c2cee2d57ac768b24aa"

RPROVIDES:${PN} += "python3-newt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnewt.so.0.52 \
newt \
python-abi"

inherit rpm
