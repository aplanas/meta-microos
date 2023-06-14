SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.1"

RPM_NAME = "python39-Django-4.2.1-1.1.noarch.rpm"
RPM_HASH = "63f7e32df69a27d6623b5eec32c0899df1ee375dfb73862d8ee684f1a63acb26536a415c6617628c6d0f5e06c9c485e0ba5477a7721b4e8a8a13958895096d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django \
python39-Django \
python39-South \
python39-django \
python3dist-django"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
