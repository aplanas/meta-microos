SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-python-dotenv-1.0.0-1.1.noarch.rpm"
RPM_HASH = "cc4979bdac9fc8000bf906e9e0135d6eeb6d6861ade8df8632534fafa1ed3e5b507f0b76d5d7faabcf45a30e7d6540ae50b1f637065da2133b5125d0e5638af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-dotenv) \
python39-python-dotenv \
python3dist(python-dotenv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
update-alternatives"

inherit rpm
