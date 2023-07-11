SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python310-django-eremaea2-2.0.18-1.3.noarch.rpm"
RPM_HASH = "7b49865acca493197914e247a8027195c7eb3e0f6755bb8eaf98c9598510aad621441a42eea1a903805222289ff7f2b8120aaab0b511b69084195a94a7aa4e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-eremaea2 \
python310-django-eremaea2 \
python3dist-django-eremaea2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
eremaea \
python-abi \
python310-Django \
python310-cmdln \
python310-djangorestframework \
python310-magic \
python310-requests \
python310-requests-toolbelt \
update-alternatives"

inherit rpm
