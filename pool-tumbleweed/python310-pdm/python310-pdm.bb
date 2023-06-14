SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.4.9"

RPM_NAME = "python310-pdm-2.4.9-2.1.noarch.rpm"
RPM_HASH = "61b2e1de9a003e2e46aff22287d0db1a75f2793e2fda8f44c60546e05c7da6e6dbf4e096b82cef3988566dcc65bbbf86b6c242d156147b22f30967f063384417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm \
python3.10dist-pdm \
python310-pdm \
python3dist-pdm"

RDEPENDS:${PN} += "-python310-resolvelib >= 0.8 with python310-resolvelib < 0.9 \
-python310-tomlkit >= 0.8.0 with python310-tomlkit < 1 \
/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-blinker \
python310-cachecontrol \
python310-certifi \
python310-findpython \
python310-installer \
python310-lockfile \
python310-packaging \
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
