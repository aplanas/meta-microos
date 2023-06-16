SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python39-jupyter_console-6.6.3-1.2.noarch.rpm"
RPM_HASH = "432d4a63759bec77532bb2b3987f7680b8aae71a63aa64efc8c768fb916bb2bb7f90eec48bcbc869a28669d378c4ad8db9c2e95b6e7624bbb5dd848214e63068"
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
