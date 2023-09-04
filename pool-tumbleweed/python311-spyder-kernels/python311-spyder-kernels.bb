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

RPM_NAME = "python311-spyder-kernels-2.4.4-1.1.noarch.rpm"
RPM_HASH = "40d112d418aeace0588ece597921249b7cf7165cae286f210e24c11af55416a8e3f925d8f59c3538d6c5b58a211afd3259fa5a7b1edab3b1aa5fe36905209976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-kernels \
python3.11dist-spyder-kernels \
python311-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python311-ipykernel >= 6.23.2 with python311-ipykernel < 7 \
-python311-ipython >= 7.31.1 with python311-ipython < 9 \
-python311-jupyter-client >= 7.4.9 with python311-jupyter-client < 9 \
python-abi \
python311-cloudpickle \
python311-pyzmq \
python311-wurlitzer"

inherit rpm
