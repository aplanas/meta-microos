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

RPM_NAME = "python310-nbval-0.10.0-1.5.noarch.rpm"
RPM_HASH = "ddd262c515703d3efb5bf3d91b3ced83a0ae10a10fb768d4236431223959128409534be77390088961946e75e1b9ab347cde0e5ebcf5f3d0101422ae44d5b25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbval \
python310-jupyter-nbval \
python310-nbval \
python3dist-nbval"

RDEPENDS:${PN} += "python-abi \
python310-coverage \
python310-ipykernel \
python310-jupyter-client \
python310-nbformat \
python310-pytest"

inherit rpm
