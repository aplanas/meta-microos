SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python310-purl-1.6-2.3.noarch.rpm"
RPM_HASH = "ac4422878a25a3154e653affc953e3705bbdb0d0eab6c4f71bf3c86c6dcd754e79125a14b8d764bd4dcd488a6dcb616bb91fd799fd5c76af39b62b8cfe3c5395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-purl \
python310-purl \
python3dist-purl"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
