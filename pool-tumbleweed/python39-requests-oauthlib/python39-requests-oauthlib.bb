SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "python39-requests-oauthlib-1.3.1-3.3.noarch.rpm"
RPM_HASH = "afef10e82b935b444630ed53dc0c8bbfa0e1638971cee847423ce5933cd3ad6f7685cf189378f2eb1c670f49f1789df062f7da39666c66a97c7c8bde7184a4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-oauthlib \
python39-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python39-oauthlib \
python39-requests"

inherit rpm
