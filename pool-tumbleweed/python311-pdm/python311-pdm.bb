SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.7.4"

RPM_NAME = "python311-pdm-2.7.4-1.1.noarch.rpm"
RPM_HASH = "50612e8dd6ad5c23b332747c472ec80d1d77a46d8ecadaca54576c5c1b81a6de126a9e7db3b1a74384d134b7e1e5a89f2a8fb12dacef2daca60a75b4fbb07615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm \
python3.11dist-pdm \
python311-pdm \
python3dist-pdm"

RDEPENDS:${PN} += "-python311-resolvelib >= 0.8 with python311-resolvelib < 0.9 \
-python311-tomlkit >= 0.8.0 with python311-tomlkit < 1 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-blinker \
python311-cachecontrol \
python311-certifi \
python311-findpython \
python311-installer \
python311-lockfile \
python311-packaging \
python311-pdm-backend \
python311-platformdirs \
python311-pyproject-hooks \
python311-python-dotenv \
python311-requests-toolbelt \
python311-rich \
python311-shellingham \
python311-unearth \
python311-virtualenv \
update-alternatives"

inherit rpm
