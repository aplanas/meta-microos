SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python311-django-coverage-plugin-3.1.0-1.1.noarch.rpm"
RPM_HASH = "5f9765c2c3cc6a31ae2fff431b7d896ee174af0fde3f1ccc91c879dce0542154b6fe6706f988d9a19434b1b4bf565b666a408deb1975a4c3cfe13ce2b072c95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-coverage-plugin \
python3.11dist-django-coverage-plugin \
python311-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-coverage"

inherit rpm
