SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "5.40.1"

RPM_NAME = "python311-django-axes-5.40.1-1.3.noarch.rpm"
RPM_HASH = "71fb6cbf73badd1b98138ac84b4969307ffa161c60e0016f7204c2335dc60707ca33df253995d199895052f5418abc0e7e802a4baf7a77d02baeca2da119a780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-axes) \
python311-django-axes \
python3dist(django-axes)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-django-ipware"

inherit rpm
