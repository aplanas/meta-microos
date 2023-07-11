SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-allpairspy-2.5.0-2.5.noarch.rpm"
RPM_HASH = "19038440615ace43b737dedcddbae8287d0613b3e9dacd0d7480098734d303a7952ca4de392c08a41890134d080276e1327cbb88dd2b7a99f0094e24e35e9d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-allpairspy \
python3.11dist-allpairspy \
python311-allpairspy \
python3dist-allpairspy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
