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

RPM_NAME = "python39-jupyter-1.0.0-12.2.noarch.rpm"
RPM_HASH = "ce29298ea80e63f59c9aae4a3a70b41b8096eb0eb7df114f3d0e5304a52fb293184c7f167a82acdf0fcf19c028adc5a4e1a35df6fc14100dc060926276319ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter \
python39-jupyter \
python3dist-jupyter"

RDEPENDS:${PN} += "python-abi \
python39-ipykernel \
python39-ipywidgets \
python39-jupyter-console \
python39-jupyter-core \
python39-nbconvert \
python39-notebook \
python39-qtconsole"

inherit rpm
