SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.3"

RPM_NAME = "python39-Django-4.2.3-2.1.noarch.rpm"
RPM_HASH = "16f7b51f366dc5283bf5b46be4266a5829590db89cd74b0d568cff968082e47d5986aa973c421d83d99d6fa47c47c533771763c71dc7b9529fec71490d88992e"
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
