SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python311-requestbuilder-0.7.1-1.15.noarch.rpm"
RPM_HASH = "a62d646ab8735471f8a2f7721429ce596559911f0832834aba83f8e82d43860a40cc2116e6a5245c9d4730967751feae75b97c1b9dcc8cc9c39409dd7e9d4a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requestbuilder) \
python311-requestbuilder \
python3dist(requestbuilder)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
