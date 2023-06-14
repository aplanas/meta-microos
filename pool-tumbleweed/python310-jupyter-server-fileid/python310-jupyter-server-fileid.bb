SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python310-jupyter-server-fileid-0.9.0-1.1.noarch.rpm"
RPM_HASH = "f3df782d09c25d0b6cb82f4f7223b4372a758955a9f53ada2e72c59f30f3424e7ce2bc019c946ddcdb9db72142289b4dd4cfd3c0059bedd80cd418b06c2a9c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-fileid \
python3.10dist-jupyter-server-fileid \
python310-jupyter-server-fileid \
python3dist-jupyter-server-fileid"

RDEPENDS:${PN} += "-python310-jupyter-server >= 1.15 with python310-jupyter-server < 3 \
/bin/sh \
/usr/bin/python3.10 \
alts \
jupyter-server-fileid \
python-abi \
python310-jupyter-events"

inherit rpm
