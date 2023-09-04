SUMMARY = "Web package for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the required files to run pgAdmin4 as a web application"
LICENSE = "PostgreSQL"

PV = "7.6"

RPM_NAME = "pgadmin4-web-7.6-1.1.noarch.rpm"
RPM_HASH = "ae2b83501e3e3223996e32f9de581c2ce43e21af7c8f3523b596f604ea5a95574ac698d64c7e06adb130b7c6d69f0c9f119ae8aa874a7a4efdefb4bd8b83434d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4-web \
pgadmin4-web \
python3.11dist-pgadmin4 \
python3dist-pgadmin4"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python-abi \
python3-Authlib \
python3-Flask \
python3-Flask-Babel \
python3-Flask-Compress \
python3-Flask-Gravatar \
python3-Flask-Login \
python3-Flask-Mail \
python3-Flask-Migrate \
python3-Flask-Paranoid \
python3-Flask-SQLAlchemy \
python3-Flask-Security-Too \
python3-Flask-SocketIO \
python3-Flask-WTF \
python3-Pillow \
python3-SQLAlchemy \
python3-WTForms \
python3-Werkzeug \
python3-azure-identity \
python3-azure-mgmt-rdbms \
python3-azure-mgmt-resource \
python3-azure-mgmt-subscription \
python3-boto3 \
python3-cryptography \
python3-eventlet \
python3-google-api-python-client \
python3-google-auth-oauthlib \
python3-httpagentparser \
python3-keyring \
python3-ldap3 \
python3-passlib \
python3-psutil \
python3-psycopg \
python3-pyotp \
python3-python-dateutil \
python3-pytz \
python3-qrcode \
python3-speaklater \
python3-sqlparse \
python3-sshtunnel \
python3-urllib3 \
python3-user-agents"

inherit rpm
