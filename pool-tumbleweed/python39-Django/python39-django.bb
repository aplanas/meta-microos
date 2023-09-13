SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.5"

RPM_NAME = "python39-Django-4.2.5-1.1.noarch.rpm"
RPM_HASH = "c5c460163df28f750bee12ce1b6000a492e311453727b0efdc3fca84b84c84b2ccbe0758558d958f1ffa499c70a7e702d9d419dd88eef10ef17214692fc40d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django \
python39-Django \
python39-South \
python39-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39 \
python39-Pillow \
python39-argon2-cffi \
python39-asgiref \
python39-bcrypt \
python39-pytz \
python39-setuptools \
python39-sqlparse \
update-alternatives"

inherit rpm
