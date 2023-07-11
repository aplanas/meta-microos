SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.9"

RPM_NAME = "python310-django-mailman3-1.3.9-1.1.noarch.rpm"
RPM_HASH = "3a77094fab2de069727ecf9e13299e828ddf9394f698937ab73a186273d2cfd9571befd5623c09aca123bafe57a8bce1274747ed06cd6d6452cb4e7630efb78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-mailman3 \
python310-django-mailman3 \
python3dist-django-mailman3"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-allauth \
python310-django-gravatar2 \
python310-mailmanclient \
python310-pytz"

inherit rpm
