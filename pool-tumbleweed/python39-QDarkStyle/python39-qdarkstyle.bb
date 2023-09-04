SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-QDarkStyle-3.0.2-2.1.noarch.rpm"
RPM_HASH = "fffe40e1c5f90a7be9976facb20a27a35ccc3df468aef594ac6aa8d8b76d34e768fa1ea278240c935763b8cecb30539d5ac9ffac6eef0a565592f9796faefb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qdarkstyle \
python39-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-QtPy \
python39-setuptools"

inherit rpm
