SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.5"

RPM_NAME = "python311-metakernel-0.29.5-1.1.noarch.rpm"
RPM_HASH = "d3a251950ab7bdc1d05116f91299801b2ee85d1735840872dd15c3bc70483b2828748616dda11272c644f772bd5b1dd66108ad94a6a0f451b3d4d67451935b5a"
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
