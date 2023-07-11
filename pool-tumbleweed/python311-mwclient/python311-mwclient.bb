SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python311-mwclient-0.10.1-1.9.noarch.rpm"
RPM_HASH = "4f8e2dc7c1b6774a493fc26048a26669b39114593ee19b7f1fcc6e3dbd0326b0211d7873fbc9911c183e76c051c805edbb561916953dd2cff10aa06f5b9019ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mwclient \
python3.11dist-mwclient \
python311-mwclient \
python3dist-mwclient"

RDEPENDS:${PN} += "python-abi \
python311-requests-oauthlib \
python311-six"

inherit rpm
