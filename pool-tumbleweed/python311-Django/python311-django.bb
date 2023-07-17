SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.3"

RPM_NAME = "python311-Django-4.2.3-1.1.noarch.rpm"
RPM_HASH = "6d5c39e5ad8fa9882224578212ba7dbd6362cc7e50aac9b363e35beeab857995f7edf915d5acd2bbb5eccbf9c7a332c8cb844a763846f7747caccaef14ed2f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Django \
python3-South \
python3-django \
python3.11dist-django \
python311-Django \
python311-South \
python311-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311 \
python311-Pillow \
python311-argon2-cffi \
python311-asgiref \
python311-bcrypt \
python311-pytz \
python311-setuptools \
python311-sqlparse \
update-alternatives"

inherit rpm
