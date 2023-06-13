SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python310-djangorestframework-camel-case-1.4.2-1.3.noarch.rpm"
RPM_HASH = "dfb5bdd8a69ea65d3e55633316c7a2d209eb92c4f013dd1ea10d74c9ef3f36da0976da0b6d08f48537cd34cc273bc870d63e93cb288a1a5a2e9bb242c36cb2a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-camel-case \
python3.10dist(djangorestframework-camel-case) \
python310-djangorestframework-camel-case \
python3dist(djangorestframework-camel-case)"

RDEPENDS:${PN} += "python(abi) \
python310-djangorestframework"

inherit rpm
