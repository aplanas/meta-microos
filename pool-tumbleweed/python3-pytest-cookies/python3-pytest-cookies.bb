SUMMARY = "Cookiecutter template pytest plugin"
DESCRIPTION = "The pytest plugin for your Cookiecutter templates."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python3-pytest-cookies-0.7.0-1.1.noarch.rpm"
RPM_HASH = "3ae6919eac08a840f70f9e2d060463e71547ec4cfee713a12ef89a65be42361d7320663b2ad0b9031196c5e652b3de72104937a0dbc35e0e06fdebc56824ca02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cookies \
python3.10dist-pytest-cookies \
python3dist-pytest-cookies"

RDEPENDS:${PN} += "cookiecutter \
python-abi \
python3-pytest"

inherit rpm
