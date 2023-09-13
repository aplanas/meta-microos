SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "python39-pyarrow-devel-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "6d6707317b5324072e96ce214b0ea6f99060149418bffadcaa9067117a2bcb6a71e654bb0f91c11254ebaa6bccc46f1763b9f91b6e70feaede26151521f03959"

RPROVIDES:${PN} += "python39-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python39-Cython \
python39-pyarrow"

inherit rpm
