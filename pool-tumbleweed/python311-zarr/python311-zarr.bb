SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.16.0"

RPM_NAME = "python311-zarr-2.16.0-1.1.noarch.rpm"
RPM_HASH = "cb67c45f59dee91cef1ee77ba2a67b7a35fac5e6112d84fe88c6248c66868c0ad3a5570756910711d291bd5bfb8effe95f45317ffb93b2947b25b46971dcab82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zarr \
python3.11dist-zarr \
python311-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-asciitree \
python311-fasteners \
python311-numcodecs \
python311-numpy"

inherit rpm
