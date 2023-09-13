SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.7"

RPM_NAME = "python311-cloudflare-2.11.7-2.1.noarch.rpm"
RPM_HASH = "abd0cf420aa40afc3dbee4a3152a4fc431f911be93e20c70a19584c3d9ecc66b066f3593e7c978a0877d167dba32eced127956cf8843b47300960ecfbd7a594c"
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
python311-jsonlines \
python311-requests \
update-alternatives"

inherit rpm
