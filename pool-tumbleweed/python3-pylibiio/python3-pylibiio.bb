SUMMARY = "Industrial I/O library -- Python bindings"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "python3-pylibiio-0.24-1.5.aarch64.rpm"
RPM_HASH = "21447a98e76dfc460d598e9e56e2d50b88b2e7ba183956f1fe17e6eadecb7f693a7d8439636030668cf604226b55bd348c6e5eef1f291a045f5b0d13059c6984"

RPROVIDES:${PN} += "libiio-python \
python3-pylibiio \
python3.11dist-pylibiio \
python3dist-pylibiio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
