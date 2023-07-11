SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-nbclassic-1.0.0-1.3.noarch.rpm"
RPM_HASH = "512c8f7b7fd3dcb9164762f75e4e556b4f830243dafa2865b32dbef512033d416538d6abb5ed36b4dea6331b2f6be074f5445204dc8b64ade6fc5a58866d0d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbclassic \
python310-nbclassic \
python3dist-nbclassic"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
jupyter-nbclassic \
python-abi \
python310-Jinja2 \
python310-Send2Trash \
python310-argon2-cffi \
python310-ipykernel \
python310-ipython-genutils \
python310-jupyter-client \
python310-jupyter-core \
python310-nbconvert \
python310-nbformat \
python310-nest-asyncio \
python310-notebook-shim \
python310-prometheus-client \
python310-pyzmq \
python310-terminado \
python310-tornado \
python310-traitlets"

inherit rpm
