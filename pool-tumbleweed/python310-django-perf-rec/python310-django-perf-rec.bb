SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "python310-django-perf-rec-4.11.0-2.7.noarch.rpm"
RPM_HASH = "3defc6af8d36527360cb9b577e17d64d6af28fb54e930670f8dd34f3fe151059a590f5970fdd55080e6b26b2429ed6a4a807183c72a2a5edb0ad17c79b44df26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-perf-rec \
python3.10dist-django-perf-rec \
python310-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-PyYAML \
python310-sqlparse"

inherit rpm
