SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-django-ipware-5.0.0-1.1.noarch.rpm"
RPM_HASH = "5d6c7faf48fa75c41a8142739d578bfbaeea152e999d9b235270be402a5de4582af3e7f8c29297fdce7f7011423bf83f5b33af10261e3dd4d5847ad7e73cd805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-ipware) \
python311-django-ipware \
python3dist(django-ipware)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
