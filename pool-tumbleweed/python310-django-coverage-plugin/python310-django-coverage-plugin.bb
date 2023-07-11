SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-django-coverage-plugin-3.0.0-2.3.noarch.rpm"
RPM_HASH = "e927818cc572aead7a029c72156eee3ec9f368b7ed3c38a65ad362eabc1f484932b89393d9d586a5a1f1e1d710c313f638801eb4ee19e74972bed126cd804c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-coverage-plugin \
python310-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-coverage"

inherit rpm
