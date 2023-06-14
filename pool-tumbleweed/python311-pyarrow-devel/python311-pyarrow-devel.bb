SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "python311-pyarrow-devel-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "edcb4ecece0486121e59c08cbcddd6ccd61ca48c592b5f13d77e54c65e60f96658aabf19a1d93c45b964c99972c7de5f8106bd70b41bd8d5a840e8469ecc842f"

RPROVIDES:${PN} += "python311-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python311-Cython \
python311-pyarrow"

inherit rpm
