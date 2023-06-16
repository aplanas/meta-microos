SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python311-flask-oidc-1.4.0-5.1.noarch.rpm"
RPM_HASH = "60c8dc42804a55d09157bc443c639c78f6cd9ec4e88a56dd7e743da907b3b9197d3057ea9f7ab0980f9b10f7032ef4ed7e5c8f291433add15287b773607eaed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-oidc \
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
