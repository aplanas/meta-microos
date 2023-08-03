SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python39-zarr-2.13.3-2.1.noarch.rpm"
RPM_HASH = "cde293bc260d01bdf044daae766d61823243937b356eaeba9fe17efbdd63967fa13ea4e35f150a0f65a7f05c06212f2b646d0ff22dca1524b1613fc14ce9a5b8"
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
