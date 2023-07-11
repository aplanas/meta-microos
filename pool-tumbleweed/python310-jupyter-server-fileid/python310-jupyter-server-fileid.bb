SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python310-jupyter-server-fileid-0.9.0-1.2.noarch.rpm"
RPM_HASH = "cc06e9a8821b1c07427952918451fd4441028df34fc7518d8b4ab974254910ac39bdf118cc8d9aed0f032918c47ea3c2dcffabae3879d5cb5c31424492aea629"
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
