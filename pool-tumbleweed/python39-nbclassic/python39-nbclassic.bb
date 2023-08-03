SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-nbclassic-1.0.0-1.4.noarch.rpm"
RPM_HASH = "a2d6957054f9de727ba7b61e8c29a733a6687609dc32bfc7189444898f7623bcefbab7f7ec1c20713328838e2eba5c67064952ecfb7079de04721cf8492c456d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbclassic \
python39-nbclassic \
python3dist-nbclassic"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
