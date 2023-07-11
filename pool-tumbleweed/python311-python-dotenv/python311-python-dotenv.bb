SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-python-dotenv-1.0.0-1.3.noarch.rpm"
RPM_HASH = "6386b7d18f5069ff42edfe5dd404c7cd8fe3e9a6c4b3417910ecb3b178f0905ed3ece6cb96b3d177ef1ccf872245c3ca69ae9593f408742f12ac3c898f5cba3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-dotenv \
python3.11dist-python-dotenv \
python311-python-dotenv \
python3dist-python-dotenv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
