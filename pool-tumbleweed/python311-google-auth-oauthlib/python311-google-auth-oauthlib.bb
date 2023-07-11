SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-google-auth-oauthlib-1.0.0-3.1.noarch.rpm"
RPM_HASH = "d293a14138f67214fb168fe2b5afd706d7035f2131e218712d28237d9a6deb64a58ac00af15506824a5ca51e7a3c2f462619d43b2f07b582ec6bd180aadb055f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth-oauthlib \
python3.11dist-google-auth-oauthlib \
python311-google-auth-oauthlib \
python3dist-google-auth-oauthlib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-google-auth \
python311-requests-oauthlib \
update-alternatives"

inherit rpm
