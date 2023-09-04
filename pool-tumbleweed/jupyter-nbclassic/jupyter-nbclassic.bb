SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend. \
 \
This package contains the jupyterlab server configuration and desktop files"
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "jupyter-nbclassic-1.0.0-2.1.noarch.rpm"
RPM_HASH = "5538716147a5ce3ec0d476bc52afed1dcb0dba4229d5fe701f77b4b07c85e46749becbf07f62d7a7f67e1faa99fa7edffeec83a5dd53319391802806d760118a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbclassic"

RDEPENDS:${PN} += "python3dist-nbclassic"

inherit rpm
