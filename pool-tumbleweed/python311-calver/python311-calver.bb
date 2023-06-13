SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2022.6.26"

RPM_NAME = "python311-calver-2022.6.26-2.1.noarch.rpm"
RPM_HASH = "d996e82c56d8098f5a68d4463285309c03003220e26a227948a5fa4f2725e5af04ce4299b1a00b5a0febd9df5677c89ca06d9de455fdb8347402de0e1be27a09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(calver) \
python311-calver \
python3dist(calver)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
