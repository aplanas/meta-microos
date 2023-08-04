SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.16.0"

RPM_NAME = "python310-zarr-2.16.0-1.1.noarch.rpm"
RPM_HASH = "7641856d9c214ffb3de2b60191c0563a49b9e4002edab46f3c8eff490facda3b014bea43dfca06fbf77d46e6b3dc268ae497dccd402f70406d0db62640f81bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zarr \
python310-zarr \
python3dist-zarr"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-asciitree \
python310-fasteners \
python310-numcodecs \
python310-numpy"

inherit rpm
