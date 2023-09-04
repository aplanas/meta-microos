SUMMARY = "Jupyter kernels for Spyder's console"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package provides Jupyter kernels for use with the consoles \
of Spyder. These can launched either through Spyder itself or \
in an independent Python session, and allow for interactive or \
file-based execution of Python code in different environments, \
all inside the IDE."
LICENSE = "MIT"

PV = "2.4.4"

RPM_NAME = "python310-spyder-kernels-2.4.4-1.1.noarch.rpm"
RPM_HASH = "0f1c5cc03c1e74bdfed8f2512e68b6ddd037f20dbe5f02d09d49a0e10dff8795acbbba658b847ca58fda00cd527a9591f6837099089fcc720aef1b64c36db5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spyder-kernels \
python310-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python310-ipykernel >= 6.23.2 with python310-ipykernel < 7 \
-python310-ipython >= 7.31.1 with python310-ipython < 9 \
-python310-jupyter-client >= 7.4.9 with python310-jupyter-client < 9 \
python-abi \
python310-cloudpickle \
python310-pyzmq \
python310-wurlitzer"

inherit rpm
