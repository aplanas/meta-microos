SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python39-django-coverage-plugin-3.1.0-1.1.noarch.rpm"
RPM_HASH = "66f4f77f5f9127e649424ac71958fd39b9c1d422b90c0ef9959d6361cf888df9a1f327effe096369a37a07a850b23f239d50556ddc471501f4099db090d85cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-coverage-plugin \
python39-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-coverage"

inherit rpm
