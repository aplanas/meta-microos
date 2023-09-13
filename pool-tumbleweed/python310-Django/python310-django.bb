SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.5"

RPM_NAME = "python310-Django-4.2.5-1.1.noarch.rpm"
RPM_HASH = "a9d467b1967fe6f638200fc591d176de3f8909b9850ee9100d7316464f73334b4c54342d87559be6b8f33d852f48a5a1d0f5240ef47ad30e2504e639eb8cd9a9"
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
