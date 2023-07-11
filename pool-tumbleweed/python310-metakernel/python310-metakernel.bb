SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "0.29.4"

RPM_NAME = "python310-metakernel-0.29.4-1.5.noarch.rpm"
RPM_HASH = "05902eb5913afe331c2b2168117efec9ae8422f6d36272bf32aa37795e9244ca43ed5940172561f2cdda8cfc73e944f047496a9fec32dfc3ccf351a92147b389"
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
