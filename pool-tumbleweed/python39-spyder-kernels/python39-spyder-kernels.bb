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

RPM_NAME = "python39-spyder-kernels-2.4.3-2.3.noarch.rpm"
RPM_HASH = "3fc177816fc0065fd72a420355730d01b267217f932fcd66faddcb21f45cc12ba2f9d9a8dcff1c334eb8e7915f8c453f34a3fc5e94465d1b037df9eff0ff72c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spyder-kernels \
python39-spyder-kernels \
python3dist-spyder-kernels"

RDEPENDS:${PN} += "-python39-ipykernel >= 6.16.1 with python39-ipykernel < 7 \
-python39-ipython >= 7.31.1 with python39-ipython < 9 \
-python39-jupyter-client >= 7.4.9 with python39-jupyter-client < 9 \
python-abi \
python39-cloudpickle \
python39-pyzmq \
python39-wurlitzer"

inherit rpm
