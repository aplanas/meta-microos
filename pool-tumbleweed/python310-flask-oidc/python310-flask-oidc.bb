SUMMARY = "OpenID Connect support for Flask"
DESCRIPTION = "This library should work with any standards compliant OpenID Connect provider. \
 \
It has been tested with: \
* Ipsilon"
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "python310-flask-oidc-1.4.0-5.3.noarch.rpm"
RPM_HASH = "b0549c2712635d1f462568c2aee9c6d536fd8f5779142a8a53f4c6166adfb238a33840a58feb498fc0646b1be841ba004ba4f5e7d82b64f2062809b7d99ac3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-oidc \
python310-flask-oidc \
python3dist-flask-oidc"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Authlib \
python310-Flask \
python310-requests \
update-alternatives"

inherit rpm
