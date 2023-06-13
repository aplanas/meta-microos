SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-django-extensions-3.2.1-2.3.noarch.rpm"
RPM_HASH = "89b513ec9fbaef9d78bbf1d7991eaaf7717f8a88ed193136cc9c9338c91a09fecd001ad542caaee47741f4a3a4ad14ac566a74fa18a4647ab8388538af19f7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-extensions) \
python311-django-extensions \
python3dist(django-extensions)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
