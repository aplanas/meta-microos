SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.6"

RPM_NAME = "python310-cloudflare-2.11.6-1.1.noarch.rpm"
RPM_HASH = "e1bb458e8b3423a885a10f303fb3867167b5c5c0da6b9ba8c3b2c8a1a0043a4955f678413e4becb72c3afbad53782f7423aaaa1b73e8bc8b0baad83314505a54"
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
