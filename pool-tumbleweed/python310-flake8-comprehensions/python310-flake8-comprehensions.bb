SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.12.0"

RPM_NAME = "python310-flake8-comprehensions-3.12.0-2.1.noarch.rpm"
RPM_HASH = "bb6139b493a39f555b3d11596a642a36326c846d7f35555d0bfe8a028dec14779cbd5560cc77f777bd08b902c15a62f66df59ffba085ad11d0892d3417ebcfe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-comprehensions \
python3.10dist(flake8-comprehensions) \
python310-flake8-comprehensions \
python3dist(flake8-comprehensions)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8"

inherit rpm
