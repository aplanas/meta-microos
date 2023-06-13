SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python310-django-sortedm2m-3.1.1-1.7.noarch.rpm"
RPM_HASH = "b883b59293c09da5e278ee98e4d64496553b8e1a62551df2b720f4cdbc4bc2234412047d00e1c91e710f0b18aad9440748017c9e98609365b39afcaebbb9134b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-sortedm2m \
python3.10dist(django-sortedm2m) \
python310-django-sortedm2m \
python3dist(django-sortedm2m)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
