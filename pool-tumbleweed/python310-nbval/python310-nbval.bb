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

RPM_NAME = "python310-nbval-0.10.0-1.3.noarch.rpm"
RPM_HASH = "b19cd247b70d7d4f347329f6cb4994f9502078e66d4bc4e0ec440421b6c76b26745ac1f18fc4a8345ab6d44ed6b77a644a2ec3e3369ca2bc6e2712c72c0bc93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbval \
python3-jupyter_nbval \
python3-nbval \
python3.10dist(nbval) \
python310-jupyter_nbval \
python310-nbval \
python3dist(nbval)"

RDEPENDS:${PN} += "python(abi) \
python310-coverage \
python310-ipykernel \
python310-jupyter-client \
python310-nbformat \
python310-pytest"

inherit rpm
