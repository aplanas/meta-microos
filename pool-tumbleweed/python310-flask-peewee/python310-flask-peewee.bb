SUMMARY = "Peewee integration for flask"
DESCRIPTION = "Flask integration for peewee, including admin, authentication, rest api and more."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "python310-flask-peewee-3.0.5-1.12.noarch.rpm"
RPM_HASH = "20989d0dadd59c1cd71ee8927ff5286dfc0259ba2faa1d698dcbf9153ccca43fe8e35cf72c33f563a504141fca811ea5808d0c506790ee17c986e9e66eb9e296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-peewee \
python310-flask-peewee \
python3dist-flask-peewee"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-Jinja2 \
python310-WTForms \
python310-Werkzeug \
python310-peewee \
python310-wtf-peewee"

inherit rpm
