SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python311-flask-oidc-1.4.0-5.3.noarch.rpm"
RPM_HASH = "1f244ba9531670faec5a1ddb411d7c7594034658589f39f92438a9aa7394eb9cb2b53a97d036f5f6f63078e27a3a20e9265ca4c13b218e779cf63bbcdefd698d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-oidc \
python3.11dist-flask-oidc \
python311-flask-oidc \
python3dist-flask-oidc"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Authlib \
python311-Flask \
python311-requests \
update-alternatives"

inherit rpm
