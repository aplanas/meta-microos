SUMMARY = "Python control systems library"
DESCRIPTION = "The Python Control Systems Library is a Python module that implements basic \
operations for analysis and design of feedback control systems."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.post2"

RPM_NAME = "python310-control-0.9.3.post2-2.1.noarch.rpm"
RPM_HASH = "51a948fc02c7c447580f7243e2497b68b9d84cfff1b09bd903fb87951f2d5d9cfd00121bd2f2ac195cab5121d55ca7f6d6afc7c58697a7de5c1354599c09a94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-control \
python3.10dist-control \
python310-control \
python3dist-control"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
