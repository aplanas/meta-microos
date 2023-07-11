SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python311-zarr-2.13.3-1.6.noarch.rpm"
RPM_HASH = "4ef62ff2c81078e05296127018e5a484109e015e7f79796fb034b7c17377792e3561459ab6b5851d2e8ae8e4ff2c632304582c816d8fbb6f1abe885c1b6102cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zarr \
python3.11dist-zarr \
python311-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-asciitree \
python311-dbm \
python311-fasteners \
python311-numcodecs \
python311-numpy"

inherit rpm
