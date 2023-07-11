SUMMARY = "Peewee integration for flask"
DESCRIPTION = "Flask integration for peewee, including admin, authentication, rest api and more."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "python311-flask-peewee-3.0.5-1.12.noarch.rpm"
RPM_HASH = "a84824b6c4775b65d3d685154fa6bf6f564ab9f832fe1a54427591315a490062078b13273a213af5257dca478aeddd1f5b60c23b471085ce44b3a4b4f613f4bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-peewee \
python3.11dist-flask-peewee \
python311-flask-peewee \
python3dist-flask-peewee"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-Jinja2 \
python311-WTForms \
python311-Werkzeug \
python311-peewee \
python311-wtf-peewee"

inherit rpm
