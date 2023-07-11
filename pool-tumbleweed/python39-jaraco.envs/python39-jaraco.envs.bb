SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-jaraco.envs-2.4.0-3.3.noarch.rpm"
RPM_HASH = "580fb5f63db7a1ae6db8ebe783252134e6080a0b8960c8db6f7b2286a281328e4dce1a5c75593882cfdf82b412eac724a0e15adb95940b2e0221eaff00b68c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.envs \
python39-jaraco.envs \
python3dist-jaraco.envs"

RDEPENDS:${PN} += "python-abi \
python39-path \
python39-virtualenv"

inherit rpm
