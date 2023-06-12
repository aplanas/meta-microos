SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-jaraco.envs-2.4.0-3.1.noarch.rpm"
RPM_HASH = "01537f81c82989be907c66fff31a540f6e930f4fa037f8625456f5c32c725d0e5921714c6cf5c22a1e7cf3d791d258778f8bfb901c6374ec6e49a21edc7a67ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.envs) \
python311-jaraco.envs \
python3dist(jaraco.envs)"
RDEPENDS:${PN} += "python(abi) \
python311-path \
python311-virtualenv"

inherit rpm
