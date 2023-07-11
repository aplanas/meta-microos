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

RPM_NAME = "python310-spyder-kernels-2.4.3-2.3.noarch.rpm"
RPM_HASH = "540ab457008dd87b22dad63ab58fb15551be76c5a98850a73199b4cfac2ded6fef2d29a0d4971917e196d7fe58ba2e837bcd24525a25b6bcc89d13f087885602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spyder-kernels \
python310-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python310-ipykernel >= 6.16.1 with python310-ipykernel < 7 \
-python310-ipython >= 7.31.1 with python310-ipython < 9 \
-python310-jupyter-client >= 7.4.9 with python310-jupyter-client < 9 \
python-abi \
python310-cloudpickle \
python310-pyzmq \
python310-wurlitzer"

inherit rpm
