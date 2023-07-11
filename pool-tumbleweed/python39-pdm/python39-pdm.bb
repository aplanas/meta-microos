SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.7.4"

RPM_NAME = "python39-pdm-2.7.4-1.1.noarch.rpm"
RPM_HASH = "b8aa4670dea5d24e1e4476b98832a2e265e23c0c99383a644a5bc05b038a56f07f9a947b3c9d50f7542807e0f6d64ad5afb03face2658b595262f93af8292c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdm \
python39-pdm \
python3dist-pdm"

RDEPENDS:${PN} += "-python39-resolvelib >= 0.8 with python39-resolvelib < 0.9 \
-python39-tomlkit >= 0.8.0 with python39-tomlkit < 1 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-blinker \
python39-cachecontrol \
python39-certifi \
python39-findpython \
python39-importlib-metadata \
python39-installer \
python39-lockfile \
python39-packaging \
python39-pdm-backend \
python39-platformdirs \
python39-pyproject-hooks \
python39-python-dotenv \
python39-requests-toolbelt \
python39-rich \
python39-shellingham \
python39-tomli \
python39-typing-extensions \
python39-unearth \
python39-virtualenv \
update-alternatives"

inherit rpm
