SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.7.4"

RPM_NAME = "python310-pdm-2.7.4-1.1.noarch.rpm"
RPM_HASH = "73c3a9d130224d11fc54633b9dc0ceea4c8c929edfc29dca84038e41da8423f982c0787f46a7832d6c8b851524f48594e43d684e26290385f6f44030e67626be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdm \
python310-pdm \
python3dist-pdm"

RDEPENDS:${PN} += "-python310-resolvelib >= 0.8 with python310-resolvelib < 0.9 \
-python310-tomlkit >= 0.8.0 with python310-tomlkit < 1 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-blinker \
python310-cachecontrol \
python310-certifi \
python310-findpython \
python310-installer \
python310-lockfile \
python310-packaging \
python310-pdm-backend \
python310-platformdirs \
python310-pyproject-hooks \
python310-python-dotenv \
python310-requests-toolbelt \
python310-rich \
python310-shellingham \
python310-tomli \
python310-unearth \
python310-virtualenv \
update-alternatives"

inherit rpm
