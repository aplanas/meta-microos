SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.8"

RPM_NAME = "python311-django-mailman3-1.3.8-1.4.noarch.rpm"
RPM_HASH = "02794a9c2b4565edad1f01b3de0a6b8e4c745aa4db1ab3f242d23c820d2a1e98ab3a5ef8fc40a8cad46a3509c6619c4039852d582d9f70642130ea30873f4b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-mailman3 \
python311-django-mailman3 \
python3dist-django-mailman3"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-allauth \
python311-django-gravatar2 \
python311-mailmanclient \
python311-pytz"

inherit rpm
