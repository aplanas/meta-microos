SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python310-jupyter_console-6.6.3-1.4.noarch.rpm"
RPM_HASH = "b5ba13bac5d542a7bce298f55b58b3be642244f710f7213d069b1ab5a081bb88ad8f641f2612106fb94b19f79477c84a6203e3a7bcd51e6ea321708c7c53b069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-console \
python310-jupyter-console \
python3dist-jupyter-console"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
jupyter-jupyter-console \
python-abi \
python310-Pygments \
python310-ipykernel \
python310-ipython \
python310-jupyter-client \
python310-prompt-toolkit \
python310-pyzmq \
python310-traitlets \
update-alternatives"

inherit rpm
