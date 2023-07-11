SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python311-jupyter-server-fileid-0.9.0-1.2.noarch.rpm"
RPM_HASH = "16e9c6c9a43f6733870b2522ba66e8d2ca59fd1ef0962644825d7c201d1ac30aa0542377700d54289837b5b8618cb87c865f6690e1b2c1687495cc13ae4dadc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-fileid \
python3.11dist-jupyter-server-fileid \
python311-jupyter-server-fileid \
python3dist-jupyter-server-fileid"

RDEPENDS:${PN} += "-python311-jupyter-server >= 1.15 with python311-jupyter-server < 3 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-server-fileid \
python-abi \
python311-jupyter-events"

inherit rpm
