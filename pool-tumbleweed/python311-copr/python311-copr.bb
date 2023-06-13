SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "1.124"

RPM_NAME = "python311-copr-1.124-1.5.noarch.rpm"
RPM_HASH = "0812f4d5ff728f042eb63e7e9dd6f1cba3f85f7dfe22aaceaea521390f859ddd42887d79535bb599b28d7bf0a26a404ceafdb672f66303842d87ec02c5baa684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(copr) \
python311-copr \
python3dist(copr)"

RDEPENDS:${PN} += "python(abi) \
python311-marshmallow \
python311-munch \
python311-requests \
python311-requests-toolbelt"

inherit rpm
