SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "python310-pysaml2-7.2.1-3.3.aarch64.rpm"
RPM_HASH = "0a26bd7ddd79340f7cdae5a825c5523172103083b5e8b73af2fa65b1de054a4ad3fad76f5ac4e96bc8b0358262b7530765bb713944133e4d79654115f439c323"

RPROVIDES:${PN} += "python3.10dist-pysaml2 \
python310-pysaml2 \
python3dist-pysaml2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Paste \
python310-cryptography \
python310-defusedxml \
python310-importlib-resources \
python310-pyOpenSSL \
python310-python-dateutil \
python310-pytz \
python310-repoze.who \
python310-requests \
python310-six \
python310-xmlschema \
python310-zope.interface \
update-alternatives"

inherit rpm
