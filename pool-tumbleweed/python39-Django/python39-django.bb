SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.4"

RPM_NAME = "python39-Django-4.2.4-1.1.noarch.rpm"
RPM_HASH = "5a3f1968b22a2c403bccd9a0f89723f4e2311d005838061bc59094b4549c75c25d0e2f2d25107fe4762322c9cfc668d7f85c2f4771d1e6ac64b6e186a11d3e7c"
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
