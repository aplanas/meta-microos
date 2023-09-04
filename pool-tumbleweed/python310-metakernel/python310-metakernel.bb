SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.5"

RPM_NAME = "python310-metakernel-0.29.5-1.1.noarch.rpm"
RPM_HASH = "7ecb4753ddff67269abb976cb61e212b048385f77bb16dc86a0721dd44ff9eeccfbbf22b9a130da078efed31feb7d3598e10ee739401e5f017a10d7b19cf5bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-metakernel \
python310-jupyter-metakernel \
python310-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python310-ipykernel \
python310-jedi \
python310-jupyter-core \
python310-pexpect"

inherit rpm
