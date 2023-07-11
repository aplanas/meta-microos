SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.23.0"

RPM_NAME = "python311-django-perf-rec-4.23.0-1.1.noarch.rpm"
RPM_HASH = "d2ef090ffa4ae1226b233f72d7b9b79fcdb68931db3bc5a87bd995f0ad5352efbf4819e6bf8a4092c29e499f3a8708b10bafc4ef30c8a324a8de96764d8e2777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-perf-rec \
python3.11dist-django-perf-rec \
python311-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-PyYAML \
python311-sqlparse"

inherit rpm
