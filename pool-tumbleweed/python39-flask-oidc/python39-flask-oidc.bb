SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python39-flask-oidc-1.4.0-5.3.noarch.rpm"
RPM_HASH = "1be27ac337d585b538ecf58b8093b97e891d8adda1d11b4499216356e3e415534f8552468a20308beceb53d6e8f3026995f485cdaa3f81efe39990fa60a07c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-oidc \
python39-flask-oidc \
python3dist-flask-oidc"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Authlib \
python39-Flask \
python39-requests \
update-alternatives"

inherit rpm
