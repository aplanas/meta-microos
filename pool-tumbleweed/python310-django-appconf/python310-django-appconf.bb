SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python310-django-appconf-1.0.5-1.4.noarch.rpm"
RPM_HASH = "d26d8acaac8adcd3411e72e5eff2600105ecbf1fd66081eea45198c59afc99d33b2b81370309d61195a4c49309e5e9f8d870af31410c7048ab726fbdf6f90373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-appconf \
python3.10dist(django-appconf) \
python310-django-appconf \
python3dist(django-appconf)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
