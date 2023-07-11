SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-django-coverage-plugin-3.0.0-2.3.noarch.rpm"
RPM_HASH = "ab7c420b80416dca55a55b2b96d3231c9c4798731d73e6dd73116487d2e258157a127c7de9eb510a31cbfc0739c001792f302fa65ce760e634b44d771be6d1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-coverage-plugin \
python39-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-coverage"

inherit rpm
