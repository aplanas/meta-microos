SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python311-django-eremaea2-2.0.18-1.3.noarch.rpm"
RPM_HASH = "bcd9d260ba933647814a1f15073bcc077935614219e3f546cdb2b2a537522a207a3a80b8cd9bc7aef89b2efa0e319bb58ae4b1ac76db260f9b702bd94cadae29"
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
python311-magic \
python311-requests \
python311-requests-toolbelt \
update-alternatives"

inherit rpm
