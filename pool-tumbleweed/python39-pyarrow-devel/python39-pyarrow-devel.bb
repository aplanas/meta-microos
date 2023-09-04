SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python39-pyarrow-devel-12.0.1-2.1.aarch64.rpm"
RPM_HASH = "126261a8aed71834095200e37ca157163822d09e6b193a3567a3e4bacdd8b3d54df0de12470f93528f279181317a9bcb9da13255f8ebb0d9850fb769d49733fc"

RPROVIDES:${PN} += "python39-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python39-Cython \
python39-pyarrow"

inherit rpm
