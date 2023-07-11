SUMMARY = "Metapackage to install all the Jupyter components in one go"
DESCRIPTION = "Jupyter is an environment for interactive computing in multiple languages. \
It includes a console, a browser-based notebook format, and support for \
dozens of languages through the use of language-specific kernels. \
 \
Jupyter is an evolution and modularization of the IPython project, separating \
out the python3-specific parts from the language-agnostic parts. \
 \
This package pulls in the main Jupyter system, including the notebook, \
qtconsole, and the IPython kernel.  Additional components and kernels \
can be installed separately."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-jupyter-1.0.0-12.2.noarch.rpm"
RPM_HASH = "94e2305e289845b4e4d9976db1540a0a326ba79dad7fccc4165bdec43e0514b4884555e50293f37a06fa89cbc119d4922f42c0c5dacffe168ab675571846ba76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter \
python3-jupyter \
python3.11dist-jupyter \
python311-jupyter \
python3dist-jupyter"

RDEPENDS:${PN} += "python-abi \
python311-ipykernel \
python311-ipywidgets \
python311-jupyter-console \
python311-jupyter-core \
python311-nbconvert \
python311-notebook \
python311-qtconsole"

inherit rpm
