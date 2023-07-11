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

RPM_NAME = "python310-jupyter-1.0.0-12.2.noarch.rpm"
RPM_HASH = "db7133396bc52c92fb0bda3a06bb1cf8cb272a0fb8860c4cd706792a2de61d74ff8a07f7fe4380d49bab53600b83ea967aed40c24ac3b039f5d276919777b025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter \
python310-jupyter \
python3dist-jupyter"

RDEPENDS:${PN} += "python-abi \
python310-ipykernel \
python310-ipywidgets \
python310-jupyter-console \
python310-jupyter-core \
python310-nbconvert \
python310-notebook \
python310-qtconsole"

inherit rpm
