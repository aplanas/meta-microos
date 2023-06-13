SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python310-nbclassic-0.5.6-1.1.noarch.rpm"
RPM_HASH = "3564512eb478aa882a73f603cb2ca7af1278b35582b3714c0c74ba6fc5f89f650dcfc356e3c6f55e7e0573a8a1a1d4322ed13cf51c38f77338a839f7ba04c477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbclassic \
python3.10dist(nbclassic) \
python310-nbclassic \
python3dist(nbclassic)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
jupyter-nbclassic \
python(abi) \
python310-Jinja2 \
python310-Send2Trash \
python310-argon2-cffi \
python310-ipykernel \
python310-ipython_genutils \
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
