SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python310-django-coverage-plugin-3.1.0-1.1.noarch.rpm"
RPM_HASH = "342bfd3c26dab4f6aebf827d81867fd6cf0ae21d33aa67fd77ccd5c363b9fcf24f9b0603741dfa846f332e64472661c20c4cdf3a87f9843d7f7e4b1f0ddd1fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-coverage-plugin \
python310-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-coverage"

inherit rpm
