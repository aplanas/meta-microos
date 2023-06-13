SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python310-django-eremaea2-2.0.18-1.1.noarch.rpm"
RPM_HASH = "87f2e96a65d5ab0185c52361040894751196bd439b2e4e997f9520ca84b3a69e296588833e7e32e22263ed086adca4e0ddfa0357c63937f21e80a06d9e45e879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-eremaea2 \
python3.10dist(django-eremaea2) \
python310-django-eremaea2 \
python3dist(django-eremaea2)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
eremaea \
python(abi) \
python310-Django \
python310-cmdln \
python310-djangorestframework \
python310-magic \
python310-requests \
python310-requests-toolbelt \
update-alternatives"

inherit rpm
