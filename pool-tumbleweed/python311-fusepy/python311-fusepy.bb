SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python311-fusepy-3.0.1-2.14.noarch.rpm"
RPM_HASH = "8748b919599c17cb1884f27e2575636206f41f5c52aad5a7f18f9c289845a3e6f1dd3565b815b871ce708b0bb3f4b70e6e0beff72877a9e434c2a25ad5defaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fusepy) \
python311-fusepy \
python3dist(fusepy)"

RDEPENDS:${PN} += "libfuse2 \
python(abi)"

inherit rpm
