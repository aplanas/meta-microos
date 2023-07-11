SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-jaraco.envs-2.4.0-3.3.noarch.rpm"
RPM_HASH = "a88fe07a4e788e6659b90baf7e9eba3584182cbb207c9c7a2bbab83f7bead0078ffae28f50c1a9c20b4708c2f06689ff82e5c8e33279993e3603ea16de4bf8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.envs \
python3.11dist-jaraco.envs \
python311-jaraco.envs \
python3dist-jaraco.envs"

RDEPENDS:${PN} += "python-abi \
python311-path \
python311-virtualenv"

inherit rpm
