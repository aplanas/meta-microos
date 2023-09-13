SUMMARY = "An Enterprise Resource Planning (ERP) system"
DESCRIPTION = "This package contains the server of the Tryton application platform, \
the latter of which is a three-tier high-level general purpose \
application platform written in Python, using Postgresql as the \
database engine. Tryton provides modularity, scalability and \
security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.35"

RPM_NAME = "trytond-6.0.35-1.1.noarch.rpm"
RPM_HASH = "693d1e25abb4aea263f839f4e9a9d64e0d2a05bfc09ba42887aaf5b8d60809a052b91fc9bd5229d0dd4f736b248071e977e75ebeffea6beec2a5340b9b20e782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-trytond \
python3.11dist-trytond \
python3dist-trytond \
trytond"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
graphviz \
html2text \
libreoffice-pyuno \
python-abi \
python3-Genshi \
python3-Levenshtein \
python3-Pillow \
python3-Werkzeug \
python3-bcrypt \
python3-dateutil \
python3-defusedxml \
python3-gevent \
python3-lxml \
python3-passlib \
python3-polib \
python3-psycopg2 \
python3-pydot \
python3-python-sql \
python3-relatorio \
python3-weasyprint \
python3-wrapt \
unoconv"

inherit rpm
