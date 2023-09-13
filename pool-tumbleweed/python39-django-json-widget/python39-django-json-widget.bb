SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-django-json-widget-1.1.1-3.1.noarch.rpm"
RPM_HASH = "bfa561739bbf27b625d9106509884ed03e2476c2c7e3dc7664959fca2d002769214cd4a06fe14eddf4107b6c581ff9c623ac84a26c60e9ca780f7d6c69bf0e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-json-widget \
python39-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
