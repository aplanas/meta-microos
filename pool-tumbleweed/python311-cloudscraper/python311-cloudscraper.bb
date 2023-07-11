SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "1.2.58"

RPM_NAME = "python311-cloudscraper-1.2.58-3.13.noarch.rpm"
RPM_HASH = "0acffa249d16d59c7f4c48d9b44df36b7e9d8de0f965239ccb013c1c4b4f47bbcbf9fbea5eb2e93cb67fdf954b9666fd5f10715c1c0a2273050037b25bfc547a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudscraper \
python3.11dist-cloudscraper \
python311-cloudscraper \
python3dist-cloudscraper"

RDEPENDS:${PN} += "python-abi \
python311-pyparsing \
python311-requests \
python311-requests-toolbelt"

inherit rpm
