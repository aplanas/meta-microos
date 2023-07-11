SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-pytest-testconfig-0.2.0-1.16.noarch.rpm"
RPM_HASH = "d65d2b5077fd5ec9e87a335919fd88c6e3b7480dc5d48578725f89baa0b25394f36292c2747ee9b9e8f0f33904e3a370325b68a61f885048647b09b041e600d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testconfig \
python3.11dist-pytest-testconfig \
python311-pytest-testconfig \
python3dist-pytest-testconfig"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
