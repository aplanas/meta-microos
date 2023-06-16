SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.8.15"

RPM_NAME = "python39-cloudflare-2.8.15-1.7.noarch.rpm"
RPM_HASH = "14dc994109e56b052e4530eb1de627ae689a3650b7d2cfac15cba2a0f94c336b76d6bd79e43f2e535e7090f20a2d23dcd12b6cd5a8d0f2dc18fdc7730317e034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloudflare \
python39-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-beautifulsoup4 \
python39-future \
python39-jsonlines \
python39-requests \
update-alternatives"

inherit rpm
