SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2022.6.26"

RPM_NAME = "python39-calver-2022.6.26-2.2.noarch.rpm"
RPM_HASH = "b05df8e20a1f0c2ddf16f2669d91b9d7292c65e7a86bddad8c198413b97a10a592e0ed4e76a1236e31bc6f85ebb9f6721b204187b139e3430a62612a60f150c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-calver \
python39-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
