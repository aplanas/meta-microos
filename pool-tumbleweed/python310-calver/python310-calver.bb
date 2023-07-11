SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2022.6.26"

RPM_NAME = "python310-calver-2022.6.26-2.2.noarch.rpm"
RPM_HASH = "3766428ced9281032aa7b1494f22885fe3127c7c39b59e73db22ac5ce22bcaae7dbda766abdb89d89a69e20843d2d807b72a6d078b5e4c9062d3686f8d475ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-calver \
python310-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
