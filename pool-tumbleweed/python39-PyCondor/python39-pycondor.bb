SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-PyCondor-0.6.0-1.4.noarch.rpm"
RPM_HASH = "6c718144a456f9c80d377bbe000869e69dd692c842d36b26c9405e9aead8dc5a2936aedf7bd662bd01e6afd4300f7de197908251bbffd72295793809a2b1f3a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pycondor) \
python39-PyCondor \
python3dist(pycondor)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
