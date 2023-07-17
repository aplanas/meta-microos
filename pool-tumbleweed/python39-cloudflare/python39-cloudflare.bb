SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.6"

RPM_NAME = "python39-cloudflare-2.11.6-1.1.noarch.rpm"
RPM_HASH = "79a2ae497915dc4f17c5f51d346d0f3905d91a40ebe4f6df19b099b0556b2c57fd8b99361825f92cfceb069e1cde63e5144e206fbd10feee2f65492e820caa34"
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
