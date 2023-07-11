SUMMARY = "Forward compatibility django.utils.six for Django 3"
DESCRIPTION = "Forward compatibility django.utils.six for Django 3."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python310-django-utils-six-2.0-1.13.noarch.rpm"
RPM_HASH = "1cfe7cfb1942745b3611970ea25eaae8611f397665f82c9ce41c292b65ee9fa59e110b61fe1fd96f5680e9cc1fe06f6263febb9b91c350a125e7b4a5c9e58574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-utils-six \
python310-django-utils-six \
python3dist-django-utils-six"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
