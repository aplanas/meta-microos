SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.4"

RPM_NAME = "python311-metakernel-0.29.4-1.3.noarch.rpm"
RPM_HASH = "1ea9aae5278bc51e17752711f91c242a55d6871429d7424134c60cc8f95a0f0bcb3ea755779a79c9074ace0d68474473794da474de3e958321e043698e2304ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-metakernel \
python311-jupyter-metakernel \
python311-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python311-ipykernel \
python311-jedi \
python311-jupyter-core \
python311-pexpect"

inherit rpm
