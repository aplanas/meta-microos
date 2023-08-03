SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python311-zarr-2.13.3-2.1.noarch.rpm"
RPM_HASH = "d3381e6501292a04ac1431c41b301be748877deaa4f100fb92478e49faccf3a59dee9c3cb7c2b70e3663664ae7745e43e4c707ed08f3f3b529c9c75c087d0d31"
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
