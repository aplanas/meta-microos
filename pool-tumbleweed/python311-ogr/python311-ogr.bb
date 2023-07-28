SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.45.0"

RPM_NAME = "python311-ogr-0.45.0-2.1.noarch.rpm"
RPM_HASH = "bec939b3ac596dd0a80b93ce8d25bc7a443b77e1c7103f6e1f5691e5b14d6c85bdc07f48eb038b9478e0c1f1c94d7a1a2a85695304dae585826caca0ea42dbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ogr \
python3.11dist-ogr \
python311-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-GitPython \
python311-PyGithub \
python311-PyYAML \
python311-cryptography \
python311-python-gitlab \
python311-requests"

inherit rpm
