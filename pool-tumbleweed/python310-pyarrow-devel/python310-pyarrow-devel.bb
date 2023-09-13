SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "python310-pyarrow-devel-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "22da4e8a38d4cde51c45cdf5f1073ecbea4a0c11d7289e883c7fa6ee2ffcc10a250f7a634d8e79af49bfe39e3bf384feff9e4bef57130a298e0d0e7368d1a9dc"

RPROVIDES:${PN} += "python310-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python310-Cython \
python310-pyarrow"

inherit rpm
