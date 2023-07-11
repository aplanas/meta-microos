SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python311-django-appconf-1.0.5-2.1.noarch.rpm"
RPM_HASH = "167737c6bee67777172c8d6d3cef45979ab2d5b98fb35db35b0d688dbf48cc1d4db998c005ca2b50a6c06fbb7735395d73ccf46892ef361f657496a546ec025b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-appconf \
python3.11dist-django-appconf \
python311-django-appconf \
python3dist-django-appconf"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
