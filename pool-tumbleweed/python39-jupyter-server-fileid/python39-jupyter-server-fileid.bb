SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python39-jupyter-server-fileid-0.9.0-2.1.noarch.rpm"
RPM_HASH = "69c45a424e716a239818985c3e8217af4cddd259f39b93e6c0ee2b8139ad8a686400dc22be9974e8d44d0578309d68b5544b8e0eb5f35795d74b56df8b667f93"
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
