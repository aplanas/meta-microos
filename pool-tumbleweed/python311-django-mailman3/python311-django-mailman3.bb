SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.9"

RPM_NAME = "python311-django-mailman3-1.3.9-1.1.noarch.rpm"
RPM_HASH = "5f1021b5937152806eea39911707fbb11dd6887cd439566c07bd1204e776fa6dad505e7f7fa3e7ec3f19943b37151bfa5f00fb523be2859a325d784672447b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mailman3 \
python3.11dist-django-mailman3 \
python311-django-mailman3 \
python3dist-django-mailman3"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-allauth \
python311-django-gravatar2 \
python311-mailmanclient \
python311-pytz"

inherit rpm
