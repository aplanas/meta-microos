SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "1.2.58"

RPM_NAME = "python310-cloudscraper-1.2.58-3.13.noarch.rpm"
RPM_HASH = "60031ba0bde0426da49f684127f090683c318375dd63e105823091e569b3342fbba8aa89476f00ad97b6c7a2b2793978ef1e64094828e8c56fdad7c6f61f2ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloudscraper \
python310-cloudscraper \
python3dist-cloudscraper"

RDEPENDS:${PN} += "python-abi \
python310-pyparsing \
python310-requests \
python310-requests-toolbelt"

inherit rpm
