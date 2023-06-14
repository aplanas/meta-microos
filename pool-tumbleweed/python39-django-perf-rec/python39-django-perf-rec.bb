SUMMARY = "Keep detailed records of the performance of your Django code"
DESCRIPTION = "Keep detailed records of the performance of your Django code."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "python39-django-perf-rec-4.11.0-2.7.noarch.rpm"
RPM_HASH = "c082bd52a65fb736dcff5f02a585b9b3ba47b2680fac1e9c39947c8c47c7b413b79edc6835124e382aeb0b5a2dfa0b0f6095cf7f6aeaf2829f98f7293d4ee09e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-perf-rec \
python39-django-perf-rec \
python3dist-django-perf-rec"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-PyYAML \
python39-sqlparse"

inherit rpm
