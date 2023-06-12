SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.4"

RPM_NAME = "python310-metakernel-0.29.4-1.3.noarch.rpm"
RPM_HASH = "b039a9c44b2ef8ace076494525285c2b4baaeeb388a2b9e97ab7a961a3c87a512333d982613ff838d58c4c8e6d7e3024bb29c69ca63712985166766b2ee794de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-metakernel \
python3-jupyter_metakernel \
python3-metakernel \
python3.10dist(metakernel) \
python310-jupyter_metakernel \
python310-metakernel \
python3dist(metakernel)"
RDEPENDS:${PN} += "python(abi) \
python310-ipykernel \
python310-jedi \
python310-jupyter-core \
python310-pexpect"

inherit rpm
