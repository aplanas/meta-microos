SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.1"

RPM_NAME = "python310-cloudflare-2.11.1-1.1.noarch.rpm"
RPM_HASH = "5a46a73ea507ff26d018fbe1b14eb3ff16417c2aa6ff9fd8dca551df4cc8ef267b957eed508efd898e0563b488e4d4480def869d4eaa4422a7f40c000191ca6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloudflare \
python310-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-beautifulsoup4 \
python310-future \
python310-jsonlines \
python310-requests \
update-alternatives"

inherit rpm
