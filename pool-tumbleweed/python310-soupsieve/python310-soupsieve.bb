SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "A modern CSS selector implementation for BeautifulSoup"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python310-soupsieve-2.4.1-1.3.noarch.rpm"
RPM_HASH = "ddb33ae8fef3c77e0e496075e5e6f62d1556d1dfa73b2a28811b0d8de0cfe4fe568bd325bfd2b27d0dc31eed2fd806265b8759b5e0b979190ec5a57924abb3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-soupsieve \
python310-soupsieve \
python3dist-soupsieve"

RDEPENDS:${PN} += "python-abi"

inherit rpm
