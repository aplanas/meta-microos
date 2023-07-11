SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python39-jupyter_console-6.6.3-1.4.noarch.rpm"
RPM_HASH = "742296916283f4524112157ba21d6222c7da4ac74968562a29ad16d2449231fc9bab536736b63bdb78ee2b9352f1432ec12a7064988066925eb6c232f9a16b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-console \
python39-jupyter-console \
python3dist-jupyter-console"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
jupyter-jupyter-console \
python-abi \
python39-Pygments \
python39-ipykernel \
python39-ipython \
python39-jupyter-client \
python39-prompt-toolkit \
python39-pyzmq \
python39-traitlets \
update-alternatives"

inherit rpm
