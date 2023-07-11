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

PV = "2.4.3"

RPM_NAME = "python311-spyder-kernels-2.4.3-2.3.noarch.rpm"
RPM_HASH = "4a16969cab5ef5102df9bef427f3bba370167b0f63187275de11b14af70e350414e2705f0e68a342dd0d04a05273e192bf30c1ea0cbb74597ab681f281d4b805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-kernels \
python3.11dist-spyder-kernels \
python311-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python311-ipykernel >= 6.16.1 with python311-ipykernel < 7 \
-python311-ipython >= 7.31.1 with python311-ipython < 9 \
-python311-jupyter-client >= 7.4.9 with python311-jupyter-client < 9 \
python-abi \
python311-cloudpickle \
python311-pyzmq \
python311-wurlitzer"

inherit rpm
