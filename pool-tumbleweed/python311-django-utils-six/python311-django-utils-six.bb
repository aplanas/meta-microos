SUMMARY = "Forward compatibility django.utils.six for Django 3"
DESCRIPTION = "Forward compatibility django.utils.six for Django 3."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python311-django-utils-six-2.0-1.13.noarch.rpm"
RPM_HASH = "2fc5e1a9bd52ddbd50832b3a088e20a94e43413338288310ae6b65c8a9e8096f3b0157e98882a0a05c0b75f3ac1257be6e3dc658190cd0576934d897cfbbe2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-utils-six \
python3.11dist-django-utils-six \
python311-django-utils-six \
python3dist-django-utils-six"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
