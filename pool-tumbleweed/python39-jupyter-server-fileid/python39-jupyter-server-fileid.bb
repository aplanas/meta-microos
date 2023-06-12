SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python39-jupyter-server-fileid-0.9.0-1.1.noarch.rpm"
RPM_HASH = "5285ca22e5ca89400b2f078dfb25f78124887d434f110e8b4da3968e468db7d8d04ebd3d55b62569a12f383aacad8620ad305fef01678b0c4dff629b5c3ac0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-server-fileid) \
python39-jupyter-server-fileid \
python39-jupyter_server_fileid \
python3dist(jupyter-server-fileid)"
RDEPENDS:${PN} += "(python39-jupyter-server >= 1.15 with python39-jupyter-server < 3) \
/bin/sh \
/usr/bin/python3.9 \
alts \
jupyter-server-fileid \
python(abi) \
python39-jupyter-events"

inherit rpm
