SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python310-jupyter-server-fileid-0.9.0-2.1.noarch.rpm"
RPM_HASH = "69c994a3ccde433b3d421afb116a8eadd2ffaf0bd9d471b41e82fc2e382c37f0ece8990095382290828f17ca2f5ab1f9c98c061de9abd47f7d04cfbdd0910f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-server-fileid \
python310-jupyter-server-fileid \
python3dist-jupyter-server-fileid"

RDEPENDS:${PN} += "-python310-jupyter-server >= 1.15 with python310-jupyter-server < 3 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-server-fileid \
python-abi \
python310-jupyter-events"

inherit rpm
