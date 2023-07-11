SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-python-dotenv-1.0.0-1.3.noarch.rpm"
RPM_HASH = "a63de10f03dde3cb3fba5652c398f03fabd2ebc27e4da9d0a9b42192cb35c753cf31f7f107d43d914c24e43a7a77b9cce519674fe6e6f48e32949198af89cb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-dotenv \
python310-python-dotenv \
python3dist-python-dotenv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
