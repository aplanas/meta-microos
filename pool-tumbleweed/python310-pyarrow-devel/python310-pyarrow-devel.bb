SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "python310-pyarrow-devel-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "fa47125817cb1e47abe0d68ad59778fdc5dd6c34c387e90030e6af457151988adbc4c09afedca1b19060dd12961c8458d84ca4f76c108805b4f911052444921f"

RPROVIDES:${PN} += "python3-pyarrow-devel \
python310-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python310-Cython \
python310-pyarrow"

inherit rpm
