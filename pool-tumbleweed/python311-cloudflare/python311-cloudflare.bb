SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.6"

RPM_NAME = "python311-cloudflare-2.11.6-1.1.noarch.rpm"
RPM_HASH = "8135fc7f448f6130c7df288b5c6df32628a6981c591698312f488921b64d59a97b3d1b9ede9b6de427227864de4283acbd051d789d4452c70de04dc33f1c8f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudflare \
python3.11dist-cloudflare \
python311-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-beautifulsoup4 \
python311-future \
python311-jsonlines \
python311-requests \
update-alternatives"

inherit rpm
