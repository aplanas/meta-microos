SUMMARY = "Official Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python310-discogs-client-2.3.0-1.5.noarch.rpm"
RPM_HASH = "d985bdea4b80e08f1c40534ae8832402f00b234c792b1c12d3e7a9b2b8b7bb6b4f0e5853ce015968ed403cabb31717165ca2d7a8b82b4f0f8438c83a484cb413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-discogs-client \
python310-discogs-client \
python3dist-discogs-client"

RDEPENDS:${PN} += "python-abi \
python310-oauthlib \
python310-requests \
python310-six"

inherit rpm
