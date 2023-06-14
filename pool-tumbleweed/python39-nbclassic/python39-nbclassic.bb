SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python39-nbclassic-0.5.6-1.1.noarch.rpm"
RPM_HASH = "7709fd5e7ef9baa289746d235acf9b7d1b1a60188b5be1bfc221e1412d233052291beead7f261174b696cc74f4fa29756b296479aed9ed27c7905272ea9fa5eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbclassic \
python39-nbclassic \
python3dist-nbclassic"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
jupyter-nbclassic \
python-abi \
python39-Jinja2 \
python39-Send2Trash \
python39-argon2-cffi \
python39-ipykernel \
python39-ipython-genutils \
python39-jupyter-client \
python39-jupyter-core \
python39-nbconvert \
python39-nbformat \
python39-nest-asyncio \
python39-notebook-shim \
python39-prometheus-client \
python39-pyzmq \
python39-terminado \
python39-tornado \
python39-traitlets"

inherit rpm
