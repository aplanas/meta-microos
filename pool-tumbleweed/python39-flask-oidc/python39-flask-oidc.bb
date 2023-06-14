SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python39-flask-oidc-1.4.0-5.1.noarch.rpm"
RPM_HASH = "0dceef794778e0af5708b86648a3edf32bdff6de1b71c6080dcb93cebca1523fa1e19ee3b320dadd4a83d39c219e681fed65e235fa7d1776d6a51d25d633a584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-oidc \
python39-flask-oidc \
python3dist-flask-oidc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Authlib \
python39-Flask \
python39-requests \
update-alternatives"

inherit rpm
