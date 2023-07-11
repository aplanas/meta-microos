SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-nbclassic-1.0.0-1.3.noarch.rpm"
RPM_HASH = "ea39292adc1c8582e5bc29812ffb331d7e63a72511f4b12d491ad13c8cf85d25f9d279d7aaaaf47991003547841513179882257ea33a1638e0b9322132ad1962"
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
