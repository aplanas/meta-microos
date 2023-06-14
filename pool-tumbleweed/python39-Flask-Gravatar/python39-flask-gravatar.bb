SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-Flask-Gravatar-0.5.0-4.8.noarch.rpm"
RPM_HASH = "61b74527d49eb1ce269bcb70dc82f037b0b087ca513d98f47a89e1e237e2af3b7ccc7a6ff9e07da513053aa002149a4d488ce0ddec341d7d633eed07f37af677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-gravatar \
python39-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm
