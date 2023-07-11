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

RPM_NAME = "python39-nbval-0.10.0-1.5.noarch.rpm"
RPM_HASH = "52bdc5308f9c71aa7f9b84dd03961d6ab26f9fcc01a432c963bc81dfd3aebf11f3e7a5c637887daa331f8287adf24b8e1fbf8549eee6f4d40f5b601565ff687a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbval \
python39-jupyter-nbval \
python39-nbval \
python3dist-nbval"

RDEPENDS:${PN} += "python-abi \
python39-coverage \
python39-ipykernel \
python39-jupyter-client \
python39-nbformat \
python39-pytest"

inherit rpm
