SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python310-fusepy-3.0.1-2.14.noarch.rpm"
RPM_HASH = "c684c4a1390db3d538818a978109213318a95f99598433814c496c7da4b5263785e3d004d7d0a8f4119b43fd7cd48a81b5d8e292c3b4fd6eb4f98cd60e1a0235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fusepy \
python3.10dist(fusepy) \
python310-fusepy \
python3dist(fusepy)"

RDEPENDS:${PN} += "libfuse2 \
python(abi)"

inherit rpm
