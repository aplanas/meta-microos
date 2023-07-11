SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python311-Flask-Mail-0.9.1-3.8.noarch.rpm"
RPM_HASH = "e511a3c46432788cef1a3626e9ab8ebf70fecca9525625cd9eac43d8979a2fd87c5153bca8b68a3ca516f461beb24392942f7d2d9cb5e9281db91308e68ceed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Mail \
python3.11dist-flask-mail \
python311-Flask-Mail \
python3dist-flask-mail"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-blinker"

inherit rpm
