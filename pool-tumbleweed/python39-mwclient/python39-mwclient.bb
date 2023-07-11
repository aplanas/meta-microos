SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python39-mwclient-0.10.1-1.9.noarch.rpm"
RPM_HASH = "0a652eea78e68fd64e7900a99cade9bc5b8b1e1b2bc97cb3a25713b5965d205fcc34e0e8bebf554f6777af8809ffb80797c98571b7d36170f016f4d099d262dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mwclient \
python39-mwclient \
python3dist-mwclient"

RDEPENDS:${PN} += "python-abi \
python39-requests-oauthlib \
python39-six"

inherit rpm
