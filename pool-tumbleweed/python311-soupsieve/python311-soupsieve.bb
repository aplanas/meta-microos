SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "A modern CSS selector implementation for BeautifulSoup"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python311-soupsieve-2.4.1-1.3.noarch.rpm"
RPM_HASH = "72cc77d247085d5fde23ada62a858a4bfdcb5e2eefd3ec02832853190420e303e2f08469b30e35c218afc7676361d7e1a57eac8465cee28e3e5f7aa9716efbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-soupsieve \
python3.11dist-soupsieve \
python311-soupsieve \
python3dist-soupsieve"

RDEPENDS:${PN} += "python-abi"

inherit rpm
