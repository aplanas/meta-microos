SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python39-watermark-2.4.3-1.1.noarch.rpm"
RPM_HASH = "337d0133aefb00a12b78e627d4343899f24f3429a6cf7b5b503a093ff8fcea744181323d05afd01cbe4f66a86922a47717a9236dc94b23c6583006e7acd5c212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-watermark \
python39-jupyter-watermark \
python39-watermark \
python3dist-watermark"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-ipython \
python39-setuptools"

inherit rpm
