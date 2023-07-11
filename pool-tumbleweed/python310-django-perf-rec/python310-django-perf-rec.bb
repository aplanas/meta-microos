SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.23.0"

RPM_NAME = "python310-django-perf-rec-4.23.0-1.1.noarch.rpm"
RPM_HASH = "9b46df2f5f5209c83049469917a14f6725cf187d3f73b6d12328c75405ed7c216934936f8e50411e34a9bbaa056676d69a70deeaad1fa4d70104b7899e35a185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-perf-rec \
python310-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-PyYAML \
python310-sqlparse"

inherit rpm
