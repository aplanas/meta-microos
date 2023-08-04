SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.16.0"

RPM_NAME = "python39-zarr-2.16.0-1.1.noarch.rpm"
RPM_HASH = "e4a95943874a79b96d75770f5ef49132ec6f21f62fd2be20c56b8e0fbb426fbd5adb14b9b913434f6f5df65dab77b63973c5bbfee1388575933d41e7266e0c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zarr \
python39-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-asciitree \
python39-fasteners \
python39-numcodecs \
python39-numpy"

inherit rpm
