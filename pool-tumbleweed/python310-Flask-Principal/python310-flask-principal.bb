SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-Flask-Principal-0.4.0-3.8.noarch.rpm"
RPM_HASH = "8f6b4e292c2c2da187b22aee465c46870db2f422efc1e3cf1c888512fd4de43cbdf7d656d864992c581d7d341e9782cb24b41862c825154ab3a77c2e373af7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Principal \
python3.10dist-flask-principal \
python310-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-blinker"

inherit rpm
