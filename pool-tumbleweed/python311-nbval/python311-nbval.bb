SUMMARY = "A pytest plugin to validate Jupyter notebooks"
DESCRIPTION = "The plugin adds functionality to py.test to recognise and collect \
Jupyter notebooks. The intended purpose of the tests is to determine \
whether execution of the stored inputs match the stored outputs of \
the .ipynb file. Whilst also ensuring that the notebooks are running \
without errors. \
 \
The tests were designed to ensure that Jupyter notebooks (especially \
those for reference and documentation), are executing consistently. \
 \
Each cell is taken as a test, a cell that doesn't reproduce the \
expected output will fail."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python311-nbval-0.10.0-1.5.noarch.rpm"
RPM_HASH = "25474be377b6a90a18c2601442755ba8cfda9f8634cf534c95e8bdca66fb451f56dc2c5e99dbbdd79a8d0252220363ca406494bd39fc3ce4c14d4484f8ffdf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbval \
python3-jupyter-nbval \
python3-nbval \
python3.11dist-nbval \
python311-jupyter-nbval \
python311-nbval \
python3dist-nbval"

RDEPENDS:${PN} += "python-abi \
python311-coverage \
python311-ipykernel \
python311-jupyter-client \
python311-nbformat \
python311-pytest"

inherit rpm
