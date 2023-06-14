SUMMARY = "Industrial I/O library -- Python bindings"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "python3-pylibiio-0.24-1.4.aarch64.rpm"
RPM_HASH = "7c8de0ea2c36c0938e7fc2f0cf7acf4c4faef106e49216cdc109f227421b22b5f415859aedd959e7f981eb80c2959f9e504f76802a99fe186c7173fe15dff584"

RPROVIDES:${PN} += "libiio-python \
python3-pylibiio \
python3.10dist-pylibiio \
python3dist-pylibiio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
