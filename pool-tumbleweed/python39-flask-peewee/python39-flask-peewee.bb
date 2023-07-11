SUMMARY = "Peewee integration for flask"
DESCRIPTION = "Flask integration for peewee, including admin, authentication, rest api and more."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "python39-flask-peewee-3.0.5-1.12.noarch.rpm"
RPM_HASH = "3a254ba9a95e53cb8e265810ad9981f4d2fb962d9279375fed226beff0d903cb58fc5cc4784dc38c416603ae9ce65e3c3d02895577e3be4e522f0941a7234093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-peewee \
python39-flask-peewee \
python3dist-flask-peewee"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Jinja2 \
python39-WTForms \
python39-Werkzeug \
python39-peewee \
python39-wtf-peewee"

inherit rpm
