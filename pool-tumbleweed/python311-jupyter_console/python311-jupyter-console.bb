SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python311-jupyter_console-6.6.3-1.4.noarch.rpm"
RPM_HASH = "4c6bc49bd501396f32c60b43ddeced6c511b9e189ca4581a6be79e2c3613d7f89891a80a78e4da2ebc50d718e31cebc32f87d287a7975ad96e65a5a3669c19bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-console \
jupyter-jupyter-console-doc \
python3-jupyter-console \
python3.11dist-jupyter-console \
python311-jupyter-console \
python3dist-jupyter-console"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
jupyter-jupyter-console \
python-abi \
python311-Pygments \
python311-ipykernel \
python311-ipython \
python311-jupyter-client \
python311-prompt-toolkit \
python311-pyzmq \
python311-traitlets \
update-alternatives"

inherit rpm
