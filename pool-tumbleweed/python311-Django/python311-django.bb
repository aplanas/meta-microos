SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.4"

RPM_NAME = "python311-Django-4.2.4-1.1.noarch.rpm"
RPM_HASH = "aa98f24d2276c43fe8b631742d9fd018e8141852356c05e71dbfd5dac951c6062bc6ab966fc5e5d9c6553aaf678e8a063994459a0d67db566aa43b08ec1aba3c"
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
