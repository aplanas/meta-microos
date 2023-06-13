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

RPM_NAME = "python310-jupyter-1.0.0-12.1.noarch.rpm"
RPM_HASH = "ec5fa2f4b4334e2872c252b5d90ff0d378a0f40f4aefc0decdfcbf1051f362b66a897f311758afc9f3df750f58d2d453156b4a50f49094250ae8460349c720b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter \
python3-jupyter \
python3.10dist(jupyter) \
python310-jupyter \
python3dist(jupyter)"

RDEPENDS:${PN} += "python(abi) \
python310-ipykernel \
python310-ipywidgets \
python310-jupyter-core \
python310-jupyter_console \
python310-nbconvert \
python310-notebook \
python310-qtconsole"

inherit rpm
