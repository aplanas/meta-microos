SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python311-pyarrow-devel-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "5e7b556a7bb3b80c9e5f5688e2c4611c1d44294896e2ebf970a20855bb8f9138aa81e58ff6f000e461cd330e7acdabdcc039279ccc7e01a04443833a03b88992"

RPROVIDES:${PN} += "python3-pyarrow-devel \
python311-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python311-Cython \
python311-pyarrow"

inherit rpm
