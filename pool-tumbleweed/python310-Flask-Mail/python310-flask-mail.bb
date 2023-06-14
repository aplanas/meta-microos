SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python310-Flask-Mail-0.9.1-3.6.noarch.rpm"
RPM_HASH = "91d5a2530b6282b6f2be5f6fa1ecc843aa08df730db3950ac37daa3c16a229176fd6ad66c9a6f51f39d4bd0f980f26595997af7cee955d9cb4844ff8bcbffed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Mail \
python3.10dist-flask-mail \
python310-Flask-Mail \
python3dist-flask-mail"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-blinker"

inherit rpm
