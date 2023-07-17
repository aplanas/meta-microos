SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.24.0"

RPM_NAME = "python311-django-perf-rec-4.24.0-1.1.noarch.rpm"
RPM_HASH = "728d82e95bb74e37969f21ee64b0b0909df25959aa230b3838879c23e18905599793c193d056e5a1e3801351bce06852f06ec11f86ac18a22271b60c69b74176"
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
