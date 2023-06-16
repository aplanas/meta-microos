SUMMARY = "Web package for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the required files to run pgAdmin4 as a web application"
LICENSE = "PostgreSQL"

PV = "4.30"

RPM_NAME = "pgadmin4-web-4.30-2.10.noarch.rpm"
RPM_HASH = "e5bc2dc187b8ee79b6a4eb7476b77d790ebe36bd12b73bea8665233fb87b582295a625300e2ccd78d725e9a446320ab55581cd81547547704026e2cefbd28142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4-web \
pgadmin4-web"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-Babel \
python3-Flask \
python3-Flask-BabelEx \
python3-Flask-Compress \
python3-Flask-Gravatar \
python3-Flask-HTMLmin \
python3-Flask-Login \
python3-Flask-Mail \
python3-Flask-Migrate \
python3-Flask-Paranoid \
python3-Flask-Principal \
python3-Flask-SQLAlchemy \
python3-Flask-Security-Too \
python3-Flask-WTF \
python3-Jinja2 \
python3-MarkupSafe \
python3-SQLAlchemy \
python3-WTForms \
python3-Werkzeug \
python3-beautifulsoup4 \
python3-blinker \
python3-click \
python3-cryptography \
python3-extras \
python3-fixtures \
python3-gssapi \
python3-html5lib \
python3-htmlmin \
python3-itsdangerous \
python3-ldap3 \
python3-linecache2 \
python3-passlib \
python3-pbr \
python3-psutil \
python3-psycopg2 \
python3-pycrypto \
python3-pyrsistent \
python3-python-dateutil \
python3-python-mimeparse \
python3-pytz \
python3-simplejson \
python3-six \
python3-speaklater \
python3-sqlparse \
python3-sshtunnel"

inherit rpm
