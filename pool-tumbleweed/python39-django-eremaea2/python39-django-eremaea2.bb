SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python39-django-eremaea2-2.0.18-1.3.noarch.rpm"
RPM_HASH = "594eda7b7a02bbe4f7a81f3fd8cd871d3fb18379a06c0747318bca415aff15c382d27921262bdb133f8a5308167605f4c16f18c9b3b017dddf7f8e4f3f1f6971"
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
python39-magic \
python39-requests \
python39-requests-toolbelt \
update-alternatives"

inherit rpm
