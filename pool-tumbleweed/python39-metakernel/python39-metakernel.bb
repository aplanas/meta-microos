SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.5"

RPM_NAME = "python39-metakernel-0.29.5-1.1.noarch.rpm"
RPM_HASH = "88796a8d3d006a8fd7741d09ae8dac5bae7ca8ba76fa37c6c3ef7077d44141a189b6f4f7404d7cb04a84861bb0d6afcaacfac03a29d2248cbd73678e11c8b64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-metakernel \
python39-jupyter-metakernel \
python39-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python39-ipykernel \
python39-jedi \
python39-jupyter-core \
python39-pexpect"

inherit rpm
