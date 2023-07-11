SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python311-Django-4.2.2-2.3.noarch.rpm"
RPM_HASH = "2e8b1de60fc8de894e6bb3241f2bbf6fe09681011336ee3e1f0d53bda125e2b8ce7a92294f904178dfeb3453cb3f7bbf3f870562d780e8d3ea86c447323bed8d"
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
