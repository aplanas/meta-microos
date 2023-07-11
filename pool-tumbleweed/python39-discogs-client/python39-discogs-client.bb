SUMMARY = "Official Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python39-discogs-client-2.3.0-1.5.noarch.rpm"
RPM_HASH = "5a8e1461a994feacce4bc365ebd415e551dcf5c2cbb48f4275544d993d7bd870d1b90e4e3bf7409aae242ff5b320fd5af2f890d529609099663d5b1406160b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-discogs-client \
python39-discogs-client \
python3dist-discogs-client"

RDEPENDS:${PN} += "python-abi \
python39-oauthlib \
python39-requests \
python39-six"

inherit rpm
