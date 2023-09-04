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

RPM_NAME = "python39-spyder-kernels-2.4.4-1.1.noarch.rpm"
RPM_HASH = "d1dd468e1e6ed87de030c41946b2f1de4a8b58837098578f2d90db051d0df2249cb779421907073352a73c6ef0483f25226a7865615170a6a30a82dffe086c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spyder-kernels \
python39-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python39-ipykernel >= 6.23.2 with python39-ipykernel < 7 \
-python39-ipython >= 7.31.1 with python39-ipython < 9 \
-python39-jupyter-client >= 7.4.9 with python39-jupyter-client < 9 \
python-abi \
python39-cloudpickle \
python39-pyzmq \
python39-wurlitzer"

inherit rpm
