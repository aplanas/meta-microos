SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "5.40.1"

RPM_NAME = "python311-django-axes-5.40.1-1.5.noarch.rpm"
RPM_HASH = "b83c4003a92e963ab2a28960c2061fdf96cb00c0340a6461026f27f4f18e88858278488e78efbe9d5c40b0eb594505173637915d1fee3c30a0923a165ec1573f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-axes \
python3.11dist-django-axes \
python311-django-axes \
python3dist-django-axes"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-ipware"

inherit rpm
