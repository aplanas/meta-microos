SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-google-auth-oauthlib-1.0.0-2.2.noarch.rpm"
RPM_HASH = "002abe5fbae1e3fa8635adb3609b476690e6e94037869fb4e69b492cda0759431f9d25b81ffbce682237489222dc5677adc82f57f9d667c9211c101bfa0041b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-auth-oauthlib) \
python311-google-auth-oauthlib \
python3dist(google-auth-oauthlib)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-google-auth \
python311-requests-oauthlib \
update-alternatives"

inherit rpm
