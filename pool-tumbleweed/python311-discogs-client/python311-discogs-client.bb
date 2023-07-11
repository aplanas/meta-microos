SUMMARY = "Official Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python311-discogs-client-2.3.0-1.5.noarch.rpm"
RPM_HASH = "81c9a111f7c20355004c1b58fbcffd3ca0724df8cc1e3a21f1018fc478835ab13916a44b4a1e8785c85bb7db2bd1ad8a181f6488afd75971072734555e430698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-discogs-client \
python3.11dist-discogs-client \
python311-discogs-client \
python3dist-discogs-client"

RDEPENDS:${PN} += "python-abi \
python311-oauthlib \
python311-requests \
python311-six"

inherit rpm
