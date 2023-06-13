SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python39-django-eremaea2-2.0.18-1.1.noarch.rpm"
RPM_HASH = "6c34ae13e9d2db837de98fbba38a9fa3991175e2b4d764dba1f3ed40ed4266a6928f7793be0cac4dd34fde8e2ef4208b225b5e73a8f893439d9f317c5e60be54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-eremaea2) \
python39-django-eremaea2 \
python3dist(django-eremaea2)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
eremaea \
python(abi) \
python39-Django \
python39-cmdln \
python39-djangorestframework \
python39-magic \
python39-requests \
python39-requests-toolbelt \
update-alternatives"

inherit rpm
