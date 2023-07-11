SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python39-zarr-2.13.3-1.6.noarch.rpm"
RPM_HASH = "8308c853d2ae6b4d8c290b68d87700c47b0135b82ddb2122d8cb9866cf21144a86c7c1f20cadc45363dd62eba1c9e0f926db4e7378ca4da8e447923ae42a8f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zarr \
python39-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-asciitree \
python39-dbm \
python39-fasteners \
python39-numcodecs \
python39-numpy"

inherit rpm
