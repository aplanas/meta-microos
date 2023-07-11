SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "python311-requests-oauthlib-1.3.1-3.3.noarch.rpm"
RPM_HASH = "bdd35064d14a09db8bac10e61aaf884c643c1547bf69e7769d9998919737104c0d9e421cd73dd68e440416cd2da61d103b6bbee6b4adee7db46794719151b80d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-oauthlib \
python3.11dist-requests-oauthlib \
python311-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python311-oauthlib \
python311-requests"

inherit rpm
