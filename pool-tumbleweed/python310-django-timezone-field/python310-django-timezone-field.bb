SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "5.1"

RPM_NAME = "python310-django-timezone-field-5.1-1.1.noarch.rpm"
RPM_HASH = "6d48075c843f2b48711aa88666bd0aeeaf163bd069cfaa439278a24e14b8278c14487c2a34175c0014881d787f1c2e754f0725f148e142ae22d65c336e84f111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-timezone-field \
python310-django-timezone-field \
python3dist-django-timezone-field"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pytz"

inherit rpm
