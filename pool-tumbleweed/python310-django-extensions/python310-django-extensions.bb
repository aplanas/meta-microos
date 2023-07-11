SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python310-django-extensions-3.2.3-2.1.noarch.rpm"
RPM_HASH = "d77f1be9abebb90e3344435cf501f82503a3a1d4db1afe2e6ed909dfe22abc6b7eecaac2383659a75aa092e3b13404ab3da42466eec7ec1c11b273492d5f4554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-extensions \
python310-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
