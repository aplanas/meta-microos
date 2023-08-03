SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.3"

RPM_NAME = "python310-Django-4.2.3-2.1.noarch.rpm"
RPM_HASH = "154c358408aff8856f32a9476ed36fd9a6aa96425d80d7c5acc805246a75db22de828306ded5676a3fc742ca1782326bb71e6dc2b405d0b9bc8aef23945f4608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django \
python310-Django \
python310-South \
python310-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310 \
python310-Pillow \
python310-argon2-cffi \
python310-asgiref \
python310-bcrypt \
python310-pytz \
python310-setuptools \
python310-sqlparse \
update-alternatives"

inherit rpm
