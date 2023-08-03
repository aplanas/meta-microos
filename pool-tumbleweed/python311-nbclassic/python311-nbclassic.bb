SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-nbclassic-1.0.0-1.4.noarch.rpm"
RPM_HASH = "02eb5c9452ea0283e5001d04af1356596e2fdf965d18c960a2a41d617a1a27ac85ee5d38f2ed267904918ab22db896ea6504023d89617ecba0fb01677c4d10f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbclassic \
python3.11dist-nbclassic \
python311-nbclassic \
python3dist-nbclassic"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
jupyter-nbclassic \
python-abi \
python311-Jinja2 \
python311-Send2Trash \
python311-argon2-cffi \
python311-ipykernel \
python311-ipython-genutils \
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
