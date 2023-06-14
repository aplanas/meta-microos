SUMMARY = "An Enterprise Resource Planning (ERP) system"
DESCRIPTION = "This package contains the server of the Tryton application platform, \
the latter of which is a three-tier high-level general purpose \
application platform written in Python, using Postgresql as the \
database engine. Tryton provides modularity, scalability and \
security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.32"

RPM_NAME = "trytond-6.0.32-1.1.noarch.rpm"
RPM_HASH = "6ec8055f9f9205bf72bb99aa6b584be29fad1b03dc3a5582a8823556f9e92ee14dc0b144ec3f910f15bc645007fc237b4929959e2a46b9cbe213612e308db5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-trytond \
python3.10dist-trytond \
python3dist-trytond \
trytond"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
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
