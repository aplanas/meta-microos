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

RPM_NAME = "jupyter-nbclassic-1.0.0-1.4.noarch.rpm"
RPM_HASH = "7b46e17b648f68080d3428e8458092b5e0d422881e246f6fca53e03796c8fd7452f7c17bf03b82abdc70ffe3515450b94d69a8a37c9b0255637e0dee8f0012ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbclassic"

RDEPENDS:${PN} += "python3dist-nbclassic"

inherit rpm
