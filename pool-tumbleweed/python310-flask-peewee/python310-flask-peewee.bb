SUMMARY = "Peewee integration for flask"
DESCRIPTION = "Flask integration for peewee, including admin, authentication, rest api and more."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "python310-flask-peewee-3.0.5-1.10.noarch.rpm"
RPM_HASH = "22653dfa36b2e1cacda8e27188a085fde5dac14b0bff6cf07ec1bbb229db4f288ce4f951d83990067688a4426f4cf9d122e81a7c8b3f373fc5fb27369cb233b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-peewee \
python3.10dist-flask-peewee \
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
