SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.3"

RPM_NAME = "python39-Django-4.2.3-1.1.noarch.rpm"
RPM_HASH = "4976d23cea03a90f12646097066c70de6ccbeea45cea57967ae34e7f35b319de5110bb37f202be0e171f4a7e262766e22e36e9e0a08dd69509a8783b0adb0f5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django \
python39-Django \
python39-South \
python39-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
