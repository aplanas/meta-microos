SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python39-jupyter-server-fileid-0.9.0-1.2.noarch.rpm"
RPM_HASH = "02da519c74ff1025b1f3bd97f78e82c451001ee8a2d4fe8708cf9aa45e09128abcdfe71c4d1a485b659428805197fa1ffde4b39e9e7626ceba941eff317b8bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-server-fileid \
python39-jupyter-server-fileid \
python3dist-jupyter-server-fileid"

RDEPENDS:${PN} += "-python39-jupyter-server >= 1.15 with python39-jupyter-server < 3 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
jupyter-server-fileid \
python-abi \
python39-jupyter-events"

inherit rpm
