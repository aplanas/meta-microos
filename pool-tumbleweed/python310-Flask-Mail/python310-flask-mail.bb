SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python310-Flask-Mail-0.9.1-3.8.noarch.rpm"
RPM_HASH = "4f18d5663a2c894007453c11585a2af304401b172d3499134d52791d3ae446f9ca4f38d51d81444addd61e5685b3c55893add54a732103db72bbe49f1c697a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-mail \
python310-Flask-Mail \
python3dist-flask-mail"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-blinker"

inherit rpm
