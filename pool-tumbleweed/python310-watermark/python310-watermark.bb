SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python310-watermark-2.4.3-1.1.noarch.rpm"
RPM_HASH = "c03664b6fd30445e3cd1a89cd8af7904da680b08e5ed3df12d335dc172f35c3af208c668e4596308a31cf032ec2f33bc54fba15177d29a085f967fa58064494e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-watermark \
python310-jupyter-watermark \
python310-watermark \
python3dist-watermark"

RDEPENDS:${PN} += "python-abi \
python310-importlib-metadata \
python310-ipython \
python310-setuptools"

inherit rpm
