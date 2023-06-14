SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
DESCRIPTION = "An implementation of chunked, compressed, N-dimensional arrays for Python."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python311-zarr-2.13.3-1.4.noarch.rpm"
RPM_HASH = "cb8f49db8a724bd991a5f7b970463ede8f69da546f1ca0b22f54bf4e7b32f9adc6ee83151a77af83ab46821310c9e3ef9044a545dd19f9e05dfe61e03b2a78ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zarr \
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
