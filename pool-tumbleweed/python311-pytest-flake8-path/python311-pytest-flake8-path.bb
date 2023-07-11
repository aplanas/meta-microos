SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-pytest-flake8-path-1.3.0-1.4.noarch.rpm"
RPM_HASH = "cc3695a51fe490214a73a7d50ee5a464c99b7ddd89b2b450ecb93bd8f339ad4eba4a4a67a5f2eda77ccef76d58d7df6a6f0d42c0747022f05728bda4a884c316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flake8-path \
python3.11dist-pytest-flake8-path \
python311-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-pytest"

inherit rpm
