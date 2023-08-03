SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.3"

RPM_NAME = "python311-Django-4.2.3-2.1.noarch.rpm"
RPM_HASH = "977bae10f387ae41e7b5be7923b9f73078acd2b1c175bafc1d3453f560a8822c9b156729fbacf3df9aaafb4f0ab9c789dee703ff04542ee6863177f1c7670239"
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
