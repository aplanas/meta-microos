SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python310-jupyter_console-6.6.3-1.2.noarch.rpm"
RPM_HASH = "ac5e5f469d1f3b49d6495e37880bd05b70a3c810397b3e273d7c6ac0a76eed49c23bc10b6e4539153e346b6c4b7d9d109247ae454ddad716bb0b735338d2c4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-console \
jupyter-jupyter-console-doc \
python3-jupyter-console \
python3.10dist-jupyter-console \
python310-jupyter-console \
python3dist-jupyter-console"

RDEPENDS:${PN} += "-(python310-jupyter-core >= 4.12 with python310-jupyter-core < 5.0) or python310-jupyter-core >= 5.1 \
/bin/sh \
/usr/bin/python3.10 \
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
