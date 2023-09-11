SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.7"

RPM_NAME = "python311-cloudflare-2.11.7-1.1.noarch.rpm"
RPM_HASH = "9556250d0f1e7b5533f3d9d169f026911114398195b9939da7c77d047ee87861a8f92259078a9d31935d854fecdd08ff014e1a8e2458f8d89ee74b049bb56934"
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
