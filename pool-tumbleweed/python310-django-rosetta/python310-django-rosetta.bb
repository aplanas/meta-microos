SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python310-django-rosetta-0.9.9-1.1.noarch.rpm"
RPM_HASH = "4071a5072466bd4d63feae6ef06a443051e22bea66fafdb4d7840db7787b8e3aed099e21c0270da079859a274bb1311fb6500757575fd6261ccd7c444af81cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rosetta \
python3.10dist(django-rosetta) \
python310-django-rosetta \
python3dist(django-rosetta)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-polib \
python310-requests"

inherit rpm
