SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python310-python-openid-cla-1.2-1.19.noarch.rpm"
RPM_HASH = "f6794cd15b861457d336738620f14716e61a5e6cc6eac51a52cd15ccf472f1ff4c9f43d29a51ab80bb24e79dd4eb522da151e7414e5c293aba5d5ea089412619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-openid-cla \
python310-python-openid-cla \
python3dist-python-openid-cla"

RDEPENDS:${PN} += "python-abi"

inherit rpm
