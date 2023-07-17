SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.24.0"

RPM_NAME = "python310-django-perf-rec-4.24.0-1.1.noarch.rpm"
RPM_HASH = "28cb11681a23239657ab910571f8ca73f8c7a7a57d36c364f1e933ed5e7f1e2ca5b1f4132c9d709e47664effb5639bb3dba06cf9c4de2363fd7c062a5517eec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-perf-rec \
python310-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-PyYAML \
python310-sqlparse"

inherit rpm
