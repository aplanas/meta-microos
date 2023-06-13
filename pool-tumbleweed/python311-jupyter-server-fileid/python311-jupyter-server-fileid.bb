SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python311-jupyter-server-fileid-0.9.0-1.1.noarch.rpm"
RPM_HASH = "64d5f83c3aaf8a71b55a98144ad69916bdb283c9124147610fac6e104cfcb02eb09b2b87803776c7b6439a55485b68a13bd225c7fd1f7ff02a4cf54ab23cc50b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-server-fileid) \
python311-jupyter-server-fileid \
python311-jupyter_server_fileid \
python3dist(jupyter-server-fileid)"

RDEPENDS:${PN} += "(python311-jupyter-server >= 1.15 with python311-jupyter-server < 3) \
/bin/sh \
/usr/bin/python3.11 \
alts \
jupyter-server-fileid \
python(abi) \
python311-jupyter-events"

inherit rpm
