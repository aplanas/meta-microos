SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python310-jaraco.logging-3.1.2-2.2.noarch.rpm"
RPM_HASH = "ba608a67188f6092208540c37c464257fa847b29b298c5582ec5068e6730acd2cc079d5f8d15c41d32f3e08f72b901c1f98d2702264c3d29435db1961d15f110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.logging \
python310-jaraco.logging \
python3dist-jaraco.logging"

RDEPENDS:${PN} += "python-abi \
python310-tempora"

inherit rpm
