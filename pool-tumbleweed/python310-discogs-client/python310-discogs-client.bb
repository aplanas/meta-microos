SUMMARY = "Official Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python310-discogs-client-2.3.0-1.3.noarch.rpm"
RPM_HASH = "c505e02a7661eedcaa60c9fa546d4a49f7c58d5f9e3cecb1ce36b8e6fe81642a49d626a8f21a2961fe40c2b34a8d3573bbb50647f3575b8a1f3aa165b6fdc1f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-discogs-client \
python3.10dist(discogs-client) \
python310-discogs-client \
python3dist(discogs-client)"

RDEPENDS:${PN} += "python(abi) \
python310-oauthlib \
python310-requests \
python310-six"

inherit rpm
