SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python311-django-braces-1.15.0-2.5.noarch.rpm"
RPM_HASH = "61dae6c688f722a861160dd65b8074e25a6dcedefc49d6e45d300c93ff34b0c400a4f156405565df6d0d16ed69c1125701b21a390c3239666c0dad611d88d188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-braces) \
python311-django-braces \
python3dist(django-braces)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
