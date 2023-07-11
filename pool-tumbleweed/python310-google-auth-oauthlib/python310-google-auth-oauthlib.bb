SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-google-auth-oauthlib-1.0.0-3.1.noarch.rpm"
RPM_HASH = "880fc917aea8c7f34c36dc411ecb82a26bd0d36a9ba685cf8c8e64f3fbe2573162cd99a4944da3b242b028d26e88f5bb5c9e055f3ef528fe2803ccfc310331bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-auth-oauthlib \
python310-google-auth-oauthlib \
python3dist-google-auth-oauthlib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-google-auth \
python310-requests-oauthlib \
update-alternatives"

inherit rpm
