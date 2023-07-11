SUMMARY = "Cookiecutter template pytest plugin"
DESCRIPTION = "The pytest plugin for your Cookiecutter templates."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python3-pytest-cookies-0.7.0-1.2.noarch.rpm"
RPM_HASH = "156025d86f3ca689ae1102aca51829667ba2869b122035e5e35cc6dbee7d7e36f7b2ddf464d1122982e254efbab1746d90b88b41aefb23503be6021b25fbe6ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cookies \
python3.11dist-pytest-cookies \
python3dist-pytest-cookies"

RDEPENDS:${PN} += "cookiecutter \
python-abi \
python3-pytest"

inherit rpm
