SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2022.6.26"

RPM_NAME = "python311-calver-2022.6.26-2.2.noarch.rpm"
RPM_HASH = "edeac24a9a5791e20a835d56aea78ad6e1dfbea1636cbf45414e6e3b3fd87ddba7caf946a2f5eda6994d78a8cba154bee0664af4de50a69a441840472138e173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calver \
python3.11dist-calver \
python311-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
