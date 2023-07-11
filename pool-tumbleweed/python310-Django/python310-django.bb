SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python310-Django-4.2.2-2.3.noarch.rpm"
RPM_HASH = "939c25cb3144fd2b3e1a8b39ab7842ab585a6b9b7308a2b6b8ae851e231e5e6f062dc42bea60dfc222ecac3408ddece92e97d9a7bdcefb974abdfd0c7b121c04"
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
