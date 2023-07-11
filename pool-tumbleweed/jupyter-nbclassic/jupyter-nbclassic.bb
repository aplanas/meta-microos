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

RPM_NAME = "jupyter-nbclassic-1.0.0-1.3.noarch.rpm"
RPM_HASH = "40dafe600ac25d5f39c639c4cc920c482f811f610f40a0b86fa1e52187293d3b1450414c88d73b77028350ebcc4f57d412d29eaa6c3ac88ced0f3164fa7ad399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbclassic"

RDEPENDS:${PN} += "python3dist-nbclassic"

inherit rpm
