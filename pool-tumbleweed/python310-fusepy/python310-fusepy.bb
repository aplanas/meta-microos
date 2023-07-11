SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python310-fusepy-3.0.1-2.15.noarch.rpm"
RPM_HASH = "c5e18ae4060691c9880e423b8404589e8dca59fe76e5826e18afbe5efb9038c2c6df6fbee206a06b5bdc7bfd2646568160a814e45238afb7514cc52b3e421933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fusepy \
python310-fusepy \
python3dist-fusepy"

RDEPENDS:${PN} += "libfuse2 \
python-abi"

inherit rpm
