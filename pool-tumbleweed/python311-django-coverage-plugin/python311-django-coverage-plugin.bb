SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-django-coverage-plugin-3.0.0-2.3.noarch.rpm"
RPM_HASH = "669bada303e0c86049d80a54ba59834c8338d373121eac6bb4a5062f6b9968b99bc16e3b13295d82005f27be96e4424ee337f7aa23aea2429a3538fab13a81b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-coverage-plugin \
python3.11dist-django-coverage-plugin \
python311-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-coverage"

inherit rpm
