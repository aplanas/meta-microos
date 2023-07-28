SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python39-django-eremaea2-2.0.18-2.1.noarch.rpm"
RPM_HASH = "66cf3936309ffa61d5696055b65a3c9a22f42250b2c53788f1fc191e714a5c74947f499d7a1a0fe7be858dbc813e77471c8f63aff73a283a893c40134d7fa5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-eremaea2 \
python39-django-eremaea2 \
python3dist-django-eremaea2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
eremaea \
python-abi \
python39-Django \
python39-cmdln \
python39-djangorestframework \
python39-python-magic \
python39-requests \
python39-requests-toolbelt \
update-alternatives"

inherit rpm
