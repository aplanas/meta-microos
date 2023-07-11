SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python39-jaraco.classes-3.2.3-2.3.noarch.rpm"
RPM_HASH = "c80491ac302656c4be20f8dde18d6a1c9f057dc79537321fed3e1fd5fb7a6ca87767a91c905bf63f099c10eb1b0e879f948c776e45b97f21a4e0e0508d152cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.classes \
python39-jaraco.classes \
python3dist-jaraco.classes"

RDEPENDS:${PN} += "python-abi \
python39-more-itertools"

inherit rpm
