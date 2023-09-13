SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.5"

RPM_NAME = "python311-Django-4.2.5-1.1.noarch.rpm"
RPM_HASH = "4554bc116545dc317f87c2efa0ac4980f76fdd504a10eee2301e8e98247c705c469b9b10233ea15e8e0741bea492ced1ce4814f1585dc5601fa7988f64606578"
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
