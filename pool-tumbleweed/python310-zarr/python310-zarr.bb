SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python310-zarr-2.13.3-2.1.noarch.rpm"
RPM_HASH = "9adae71f3f7c3084068af64b4661edb768e8d7f5f9607e417c9548d33ac5e13d38a9401bd7dc3c2de9029f2bf733b0a1a973631421f97fce1123372cd0a7f6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zarr \
python310-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-asciitree \
python310-dbm \
python310-fasteners \
python310-numcodecs \
python310-numpy"

inherit rpm
