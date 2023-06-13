SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.8"

RPM_NAME = "python310-django-mailman3-1.3.8-1.4.noarch.rpm"
RPM_HASH = "1c51cbe108a2951cea5558af3ba07b6727841ea29ecaf866f035dfad1bb832dca97bdf8d5d7643a19d9c390ee4ef76c1f669579ca9f1ea0766e68ad5f891d147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mailman3 \
python3.10dist(django-mailman3) \
python310-django-mailman3 \
python3dist(django-mailman3)"

RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-django-allauth \
python310-django-gravatar2 \
python310-mailmanclient \
python310-pytz"

inherit rpm
