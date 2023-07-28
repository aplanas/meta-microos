SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python310-django-eremaea2-2.0.18-2.1.noarch.rpm"
RPM_HASH = "992176a14ac0c1f7dd392cc0e5ddcdcc0944e667af6140317e4ec8e2ebb45542c11483251fb4ce29ac6fedce2fe8bc8ae2643bf389cbc5131c633ecb1f26f2c8"
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
python310-python-magic \
python310-requests \
python310-requests-toolbelt \
update-alternatives"

inherit rpm
