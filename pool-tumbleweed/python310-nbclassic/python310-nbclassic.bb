SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-nbclassic-1.0.0-2.1.noarch.rpm"
RPM_HASH = "c4e91beea9815ee7825aaa47042715a8d4416eaa7e282549cd08c62cb7868123a03d9dc6afaad256ce094975f3385a26efe01271eb33465ff6117bfb4c103f0e"
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
