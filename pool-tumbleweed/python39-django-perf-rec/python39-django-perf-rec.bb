SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.24.0"

RPM_NAME = "python39-django-perf-rec-4.24.0-1.1.noarch.rpm"
RPM_HASH = "4aa3fa28e09e3a58d334055c9dd5496e4993e482c5a21d27cf742afdf4dac591a6226bcc41c2e66eda2c4749e45d178191ec3ea8d171b697f9c7b773eb9afc41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-perf-rec \
python39-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-PyYAML \
python39-sqlparse"

inherit rpm
