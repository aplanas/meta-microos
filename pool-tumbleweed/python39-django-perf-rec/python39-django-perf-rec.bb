SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.23.0"

RPM_NAME = "python39-django-perf-rec-4.23.0-1.1.noarch.rpm"
RPM_HASH = "508b6734fb50307118ea78c5432af3356cedb627b66797df47eed1b40ef9c61f26ac0f950c852ebce4f481cc8a2f89896274c8c88fded665c516b0a96ccc7285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-perf-rec \
python39-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-PyYAML \
python39-sqlparse"

inherit rpm
