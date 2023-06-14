SUMMARY = "Tools to solve typical tasks in Web scraping"
DESCRIPTION = "Weblib provides tools to solve typical tasks in Web scraping."
LICENSE = "MIT"

PV = "0.1.30"

RPM_NAME = "python311-weblib-0.1.30-2.6.noarch.rpm"
RPM_HASH = "f114b282b70a2beca451e893a0b945b65011a0411a92bd94bf325cda7df6c16a139f26171134ba1a186a8daa833ae0ecc8048e9335a5c8b0ec103a14c748bbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-weblib \
python311-weblib \
python3dist-weblib"

RDEPENDS:${PN} += "python-abi \
python311-pytils \
python311-six \
python311-user-agent"

inherit rpm
