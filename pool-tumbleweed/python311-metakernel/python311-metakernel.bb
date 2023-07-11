SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.4"

RPM_NAME = "python311-metakernel-0.29.4-1.5.noarch.rpm"
RPM_HASH = "f4aa903c7fd296ac1f9a326239fe47876a8f607e1a38d24ad0d6207e83975327cc71ab098837aeccecd604c678580c058517ee3a9a484f8a0d76b5539c8875b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-metakernel \
python3-jupyter-metakernel \
python3-metakernel \
python3.11dist-metakernel \
python311-jupyter-metakernel \
python311-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python311-ipykernel \
python311-jedi \
python311-jupyter-core \
python311-pexpect"

inherit rpm
