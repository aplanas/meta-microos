SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.9"

RPM_NAME = "python39-django-mailman3-1.3.9-1.1.noarch.rpm"
RPM_HASH = "01e0424c39803c84f600d8abfc6e2d2a4503568791efd386170589d6d228fdd199971af87197eacc285830ac28f47c0da6bb3239beb69e72a91a7f1515f8db8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-mailman3 \
python39-django-mailman3 \
python3dist-django-mailman3"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-allauth \
python39-django-gravatar2 \
python39-mailmanclient \
python39-pytz"

inherit rpm
