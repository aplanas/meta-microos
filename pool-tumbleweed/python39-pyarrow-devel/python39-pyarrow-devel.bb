SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python39-pyarrow-devel-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "c7de571cbce1edd5eedbbe38b8f8b4544c31eea4b54328aca00ab5f79bfb7ac6d144ffa868a100bab09d61a9f3b500174d86da8921cea04eeb6ec53baaaf460b"

RPROVIDES:${PN} += "python39-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python39-Cython \
python39-pyarrow"

inherit rpm
