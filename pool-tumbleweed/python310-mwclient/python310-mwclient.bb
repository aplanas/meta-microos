SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python310-mwclient-0.10.1-1.7.noarch.rpm"
RPM_HASH = "a0e102f154a1f7bbdf4b77956a94e5d3b0771628ea85061eb7f72218ee24dfc24e2973371bf38b81e9d9573146d99fbb9034ecd611f469d87b03bc1d7242cd45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mwclient \
python3.10dist(mwclient) \
python310-mwclient \
python3dist(mwclient)"

RDEPENDS:${PN} += "python(abi) \
python310-requests-oauthlib \
python310-six"

inherit rpm
