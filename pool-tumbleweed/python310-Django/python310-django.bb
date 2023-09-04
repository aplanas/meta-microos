SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.4"

RPM_NAME = "python310-Django-4.2.4-1.1.noarch.rpm"
RPM_HASH = "9c0b4902e2de23aa1b0c7994e3c5c1cfc474d793ad4784078299ad30c65ae31da7a59732b05a2e18b70fcf2e0f60613eff17dbd66b0657db2a697d91974c68db"
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
