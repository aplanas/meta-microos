SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python310-mwclient-0.10.1-1.9.noarch.rpm"
RPM_HASH = "14cd1bb910be4ba64ed0bc54ff764148a18a29fc75ba2130866c47f9cb0d76fcd9c290ef86f0d9768abe923a6c8816525a18a5de42160b2fb9be24fe1930ba5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mwclient \
python310-mwclient \
python3dist-mwclient"

RDEPENDS:${PN} += "python-abi \
python310-requests-oauthlib \
python310-six"

inherit rpm
