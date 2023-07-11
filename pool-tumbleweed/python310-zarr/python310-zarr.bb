SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python310-zarr-2.13.3-1.6.noarch.rpm"
RPM_HASH = "2b85262b78af29f5ad391fbb11ae8776c3d15346e2faa963d6593544b4cbfa36373ff0a078e44d0f979afe2daeb061954f36aa75660b0fd5ca938356d404ad9e"
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
