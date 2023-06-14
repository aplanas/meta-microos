SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-django-extensions-3.2.1-2.3.noarch.rpm"
RPM_HASH = "836c15d612caee1952dfd5999d64dce27a8dedab55ca7cec958e80e69c7372af24da1edcb8bfb5e7d994afb39990761410d6dd68f2971860d3882289858cf1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-extensions \
python3.10dist-django-extensions \
python310-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
