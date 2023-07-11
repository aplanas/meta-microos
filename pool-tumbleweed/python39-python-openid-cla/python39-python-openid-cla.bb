SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python39-python-openid-cla-1.2-1.19.noarch.rpm"
RPM_HASH = "f356e75da3334a52985ca047de8a746af4756b2dfff2c319157f901644a5f2626dca336e901577348854e612fcd77c28133e030dc3a4bc5b4146235b3d60f3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-openid-cla \
python39-python-openid-cla \
python3dist-python-openid-cla"

RDEPENDS:${PN} += "python-abi"

inherit rpm
