SUMMARY = "An Enterprise Resource Planning (ERP) system"
DESCRIPTION = "This package contains the server of the Tryton application platform, \
the latter of which is a three-tier high-level general purpose \
application platform written in Python, using Postgresql as the \
database engine. Tryton provides modularity, scalability and \
security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.33"

RPM_NAME = "trytond-6.0.33-1.1.noarch.rpm"
RPM_HASH = "ac93e013a520c2dc61bf33bc0a6e93bfc107a4a349803fc93224624198124a39a3033c5e94d8bae86ddc5af5a7ff052ef9d81e1a76aa891de4c76b73699f1764"
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
