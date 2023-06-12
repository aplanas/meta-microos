SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.8"

RPM_NAME = "python39-django-mailman3-1.3.8-1.4.noarch.rpm"
RPM_HASH = "0368cf5fa8cf105a56c40a50aba2860052e9d66f70b49fca37250aca34d27f37cb9e18080f325972f7ad5217e317648ed2ec46baea895ff9e1dada76d5e3c18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-mailman3) \
python39-django-mailman3 \
python3dist(django-mailman3)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-django-allauth \
python39-django-gravatar2 \
python39-mailmanclient \
python39-pytz"

inherit rpm
