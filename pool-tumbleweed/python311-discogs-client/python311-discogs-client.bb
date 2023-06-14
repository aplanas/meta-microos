SUMMARY = "Official Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python311-discogs-client-2.3.0-1.3.noarch.rpm"
RPM_HASH = "07201a711b2a9b1b3157a01b542ce4182d626b6ee7fb5df208ea22c6e02ee24fdb8b29561d524e05e6cab05969a0830b72d786f458f886ccb32957b3876b141d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-discogs-client \
python311-discogs-client \
python3dist-discogs-client"

RDEPENDS:${PN} += "python-abi \
python311-oauthlib \
python311-requests \
python311-six"

inherit rpm
