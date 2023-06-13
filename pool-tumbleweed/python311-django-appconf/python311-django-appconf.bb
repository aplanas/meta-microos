SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python311-django-appconf-1.0.5-1.4.noarch.rpm"
RPM_HASH = "f2d1e48473c134b9103ff1481d761269c9bccbbe57eebb6df96aaa251922291d2a56b86a9d12e364fc9c2cf0f11d45bf89bb5b1c15bb13ac6fd1d7ee3224d9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-appconf) \
python311-django-appconf \
python3dist(django-appconf)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
