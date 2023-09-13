SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.7"

RPM_NAME = "python310-cloudflare-2.11.7-2.1.noarch.rpm"
RPM_HASH = "4ce0e9cb644b42b0d744b10fd0d2b2363f3d2ad877a04a1a622903daaf9c2ee2f08174e4ba6bff0c9b8942a8835a81476a88b2d3156aa0bd3b12c500d6df9c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloudflare \
python310-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-beautifulsoup4 \
python310-jsonlines \
python310-requests \
update-alternatives"

inherit rpm
