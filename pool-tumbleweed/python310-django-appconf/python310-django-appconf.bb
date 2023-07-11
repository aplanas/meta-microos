SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python310-django-appconf-1.0.5-2.1.noarch.rpm"
RPM_HASH = "0f39ec433f6d6a9ba514f34d2a12539497d45e08d84c65fc0a0e1e04135410cedf994ace2938bad5a2c4c820acffe5e8b257f4c403b14b519babbce586a55ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-appconf \
python310-django-appconf \
python3dist-django-appconf"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
