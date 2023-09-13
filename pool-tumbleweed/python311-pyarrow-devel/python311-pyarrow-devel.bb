SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "python311-pyarrow-devel-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "f9cd7feef4ceeecfb7a13553e3947fcbc16aaf2a211ac1f1b921bd3bf64847cbd62703edd1cb0fa544428d311ee9dde4e6ad7dabb458af98bcd724808c078eb8"

RPROVIDES:${PN} += "python3-pyarrow-devel \
python311-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python311-Cython \
python311-pyarrow"

inherit rpm
