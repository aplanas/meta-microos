SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python310-pyarrow-devel-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "031d665acfe42fc5ca8685e3abbd7399e720d25d0774f210d23e768748c511419e980e00412c75166d8b0dca6ac385f4a93436b4188738481a927ad574ecd826"

RPROVIDES:${PN} += "python310-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python310-Cython \
python310-pyarrow"

inherit rpm
