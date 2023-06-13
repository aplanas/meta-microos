SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "python311-django-perf-rec-4.11.0-2.7.noarch.rpm"
RPM_HASH = "6b3babe5464727ec5dab5cb28e20fb9efdb0f51a592c5e293aa57dfe066b5ad786ca52c4a95cf4d8073a21b13d754eec5ac42c3ddfe00d4c9ae8eaf6551050bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-perf-rec) \
python311-django-perf-rec \
python3dist(django-perf-rec)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-PyYAML \
python311-sqlparse"

inherit rpm
