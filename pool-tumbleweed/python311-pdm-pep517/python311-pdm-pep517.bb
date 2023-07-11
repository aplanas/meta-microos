SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-pdm-pep517-1.1.2-2.3.noarch.rpm"
RPM_HASH = "65a7aa33077db1a782ffd82d59d29a924a14af5ff733c35fbcef351dea07472bff2b98b969d041ea29bdfabd092258804412379c9238d8b08c4c3ebf1cb5a691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm-pep517 \
python3.11dist-pdm-pep517 \
python311-pdm-pep517 \
python3dist-pdm-pep517"

RDEPENDS:${PN} += "python-abi"

inherit rpm
