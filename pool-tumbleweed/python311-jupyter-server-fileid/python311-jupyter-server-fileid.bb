SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python311-jupyter-server-fileid-0.9.0-2.1.noarch.rpm"
RPM_HASH = "a4cc94a8c0a1e57c893c1e8c48f094df476981b838d04050c497bebb5af3fc3ab05199d56ef8bce5d369346318d8b938caffd376abecb315ae6c3888fc0c4526"
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
