SUMMARY = "Web package for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the required files to run pgAdmin4 as a web application"
LICENSE = "PostgreSQL"

PV = "4.30"

RPM_NAME = "pgadmin4-web-4.30-2.12.noarch.rpm"
RPM_HASH = "4c8867e9932c03f6cc09b4821e72bfa408c550a1a466326d6a05dec9ccd53218d3356f400b97f34cc1f49641fcdd4580af982bab6a90721bd13491290474c493"
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
