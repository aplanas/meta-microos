SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python311-pyarrow-devel-12.0.1-2.1.aarch64.rpm"
RPM_HASH = "5870ae930e3bfa8fb321c386c1a075df6e86c55ede898d9a8fbc32ac8d6c3c8ec83b9e1fd404c39983f24d07f16a1e0183628aee2b911c0958d0701a60863c69"

RPROVIDES:${PN} += "python3-pyarrow-devel \
python311-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python311-Cython \
python311-pyarrow"

inherit rpm
