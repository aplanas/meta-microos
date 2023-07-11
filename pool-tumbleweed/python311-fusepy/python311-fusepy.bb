SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python311-fusepy-3.0.1-2.15.noarch.rpm"
RPM_HASH = "47e84fce943c0d13d1f0407d5e9dfeed6fbefbf821007419c91c337c6a3daaf91f9831e5d8e74a10684f7a7f6cdd6f557720461065a3dcb312209691ebd1328a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fusepy \
python3.11dist-fusepy \
python311-fusepy \
python3dist-fusepy"

RDEPENDS:${PN} += "libfuse2 \
python-abi"

inherit rpm
