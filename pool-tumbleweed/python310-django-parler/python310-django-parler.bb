SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "python310-django-parler-2.3-3.3.noarch.rpm"
RPM_HASH = "2fbcae2dfc85ac2abaff2167b800ab5f2f683fddd1ea77f163987b6321d3ee5826f8bc2c9f60d1d5ccec4a6db0433cfacda5dc5943c913a459650e9f4b67e505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-parler \
python3.10dist(django-parler) \
python310-django-parler \
python3dist(django-parler)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
