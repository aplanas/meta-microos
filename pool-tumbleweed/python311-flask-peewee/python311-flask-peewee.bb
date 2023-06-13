SUMMARY = "Peewee integration for flask"
DESCRIPTION = "Flask integration for peewee, including admin, authentication, rest api and more."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "python311-flask-peewee-3.0.5-1.10.noarch.rpm"
RPM_HASH = "2ff9910ea71c8e3c8fb807b087f085ce9d4b79c6dc71aabc03e5d575d7f05070f25f49407f24d33905d032f4f8fd304f3f66522cc13df503eabe4e9b85ad313b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-peewee) \
python311-flask-peewee \
python3dist(flask-peewee)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-Jinja2 \
python311-WTForms \
python311-Werkzeug \
python311-peewee \
python311-wtf-peewee"

inherit rpm
