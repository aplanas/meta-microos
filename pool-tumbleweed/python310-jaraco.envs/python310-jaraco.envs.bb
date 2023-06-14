SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-jaraco.envs-2.4.0-3.1.noarch.rpm"
RPM_HASH = "6b67d7e4eb885752b040697e352aea131865403b352750c24bc1b65c5f891a1111d7360ff014ec39f0e6444fe06571e636d62af76dad92b64a10a9e0d96aa74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.envs \
python3.10dist-jaraco.envs \
python310-jaraco.envs \
python3dist-jaraco.envs"

RDEPENDS:${PN} += "python-abi \
python310-path \
python310-virtualenv"

inherit rpm
