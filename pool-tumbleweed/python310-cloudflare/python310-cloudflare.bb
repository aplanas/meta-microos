SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4."
LICENSE = "MIT"

PV = "2.11.7"

RPM_NAME = "python310-cloudflare-2.11.7-1.1.noarch.rpm"
RPM_HASH = "251cd033dcaa6f1491af54f6c45f0ef4af490a397ba74febb2e77afdce2930741e3ec6bb18c2b69d93fa55abb9afac1e5c8e60ad2d00be1e0433d00c389aa20c"
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
