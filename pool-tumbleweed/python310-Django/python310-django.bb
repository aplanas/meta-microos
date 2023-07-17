SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.3"

RPM_NAME = "python310-Django-4.2.3-1.1.noarch.rpm"
RPM_HASH = "ac2e432080b16959394d0d089f7e9fe063308c3799795fa8c957a2d010c92a11cce8941466a786c198bd1012473a9c70ffe3894ee8a5042e681f59051f2a88c9"
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
