SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python39-Django-4.2.2-2.3.noarch.rpm"
RPM_HASH = "f2b05a529921caf79c5f0e9827e9a9f213fe43ffcbaa6f16ba5960bacdb75e4fcf846d6e206cc852d73a0e11fc3cf5b8c3378f18f75195ea7f1b6cf56878f07e"
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
