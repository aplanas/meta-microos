SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-google-auth-oauthlib-1.0.0-2.2.noarch.rpm"
RPM_HASH = "4966676dda91dd180804dc75a4136e9df371def85bd9a01da69caedf1b854847a752935bae60dcf57537b54c1d20000c61e9d787e3bd8306c03202a8e929f08a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth-oauthlib \
python3.10dist-google-auth-oauthlib \
python310-google-auth-oauthlib \
python3dist-google-auth-oauthlib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-google-auth \
python310-requests-oauthlib \
update-alternatives"

inherit rpm
