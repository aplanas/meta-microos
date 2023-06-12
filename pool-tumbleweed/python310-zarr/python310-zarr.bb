SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python310-zarr-2.13.3-1.4.noarch.rpm"
RPM_HASH = "71e71e1640d9360db9e6574946a63d3c5181d91947192ddd9b465c959583ea7e3bfc89ba245f7b9141feb24fade58c6e57e2a2e69029c63205c4e1a971bdacbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zarr \
python3.10dist(zarr) \
python310-zarr \
python3dist(zarr)"
RDEPENDS:${PN} += "python(abi) \
python310 \
python310-asciitree \
python310-dbm \
python310-fasteners \
python310-numcodecs \
python310-numpy"

inherit rpm
