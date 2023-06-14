SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python39-zarr-2.13.3-1.4.noarch.rpm"
RPM_HASH = "cf4b575a0b57c2e0f6803a61af2d61381a609c67f19811ecc6ccea6dfc0d6fc3fb8ca1b21f5fc669ff34205c7e6c9678ab47cde70d5337ce350cee570e76766c"
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
