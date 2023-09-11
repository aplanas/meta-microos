SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.7"

RPM_NAME = "python39-cloudflare-2.11.7-1.1.noarch.rpm"
RPM_HASH = "708d8020a85e94cff4b99bacb2c34c69bc1762a21f6bc9af540a0f3e7d9d540e69abe3f039ba38c66bc226e430161bfbfd6cd405b8e7f8ff36103376c4d2a688"
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
