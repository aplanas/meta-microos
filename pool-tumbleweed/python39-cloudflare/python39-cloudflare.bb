SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.1"

RPM_NAME = "python39-cloudflare-2.11.1-1.1.noarch.rpm"
RPM_HASH = "1281eb78e8026858a3e84fe325fb49b9e208c4ba61e34816c63fb56381e23bc137f18552fb43462b8be9f4d1032bc73ab8935091c002fc75fac17102d46d95d5"
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
