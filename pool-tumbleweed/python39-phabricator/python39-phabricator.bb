SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python39-phabricator-0.9.1-1.5.noarch.rpm"
RPM_HASH = "dd40955407bb7bf55d6e27ef6221022306befe7f245cb1b37eaff0f1d361e621e8c0c2c8c335c84d16761fb132ddca288457d82bf22f7a843eedb1cfba4f69e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-phabricator \
python39-phabricator \
python3dist-phabricator"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
