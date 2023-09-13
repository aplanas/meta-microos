SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-django-json-widget-1.1.1-3.1.noarch.rpm"
RPM_HASH = "00dec28203a60e8033db29860ab54580d1254be0aa94673224e2c38c1c279564413eeb5423c3dbd2dbe5de0fa2a00459f8653a5d4d654907005ef8395ccc049a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-json-widget \
python310-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
