SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python311-django-eremaea2-2.0.18-2.1.noarch.rpm"
RPM_HASH = "8f4c5c956b155f23dee5b65ba93b8c470011c9fe154c68b37a688326b49e75676183122adc362719292de9f91acdd53f2253ac8eaa67c5fd2251608a0e4c0365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-eremaea2 \
python3.11dist-django-eremaea2 \
python311-django-eremaea2 \
python3dist-django-eremaea2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
eremaea \
python-abi \
python311-Django \
python311-cmdln \
python311-djangorestframework \
python311-python-magic \
python311-requests \
python311-requests-toolbelt \
update-alternatives"

inherit rpm
