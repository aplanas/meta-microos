SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.0"

RPM_NAME = "python39-pyarrow-devel-12.0.0-1.1.aarch64.rpm"
RPM_HASH = "6408ef1fceef82666515c588775b00a4f5fb94e420f49216fd6dea2c684800bfde4a73087a0e6de2bfb3f42f9067884e9643a0bb768725ecdb8cc099d4dd3fbb"

RPROVIDES:${PN} += "python39-pyarrow-devel \
python39-pyarrow-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python39-Cython \
python39-pyarrow"

inherit rpm
