SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python311-nbclassic-0.5.6-1.1.noarch.rpm"
RPM_HASH = "6faf9f6b1226a4c8cf5296c136d32df813bb120a0632021f7c0b88e966326617e6bf7230535dee7a4d97c31e3ef2d33ad0592784c06fe37ef550ca457f2aee02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nbclassic) \
python311-nbclassic \
python3dist(nbclassic)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
jupyter-nbclassic \
python(abi) \
python311-Jinja2 \
python311-Send2Trash \
python311-argon2-cffi \
python311-ipykernel \
python311-ipython_genutils \
python311-jupyter-client \
python311-jupyter-core \
python311-nbconvert \
python311-nbformat \
python311-nest-asyncio \
python311-notebook-shim \
python311-prometheus-client \
python311-pyzmq \
python311-terminado \
python311-tornado \
python311-traitlets"

inherit rpm
