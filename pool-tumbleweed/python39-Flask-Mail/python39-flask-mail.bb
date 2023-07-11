SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-Flask-Mail-0.9.1-3.8.noarch.rpm"
RPM_HASH = "5335edabd40330fad70b1a57adbb0e72897cdf9cfb187c20d4abce68ab04b58e191c3e486304da83d65a30c339e0fb872915207bf50bda5f024d29e34c3335c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-mail \
python39-Flask-Mail \
python3dist-flask-mail"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-blinker"

inherit rpm
