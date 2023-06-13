SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "A modern CSS selector implementation for BeautifulSoup"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python311-soupsieve-2.4.1-1.1.noarch.rpm"
RPM_HASH = "f7015696fc4d109955ab2787d347f47fb86ee7d6809fed58e57e41ae0c5c7f1b2a2f327097d255f84a6ab2c47f1641f5ec1106550bb6c0c324f58c4a93594dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(soupsieve) \
python311-soupsieve \
python3dist(soupsieve)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
