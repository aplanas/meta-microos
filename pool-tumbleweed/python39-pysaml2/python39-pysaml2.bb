SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "python39-pysaml2-7.2.1-3.3.aarch64.rpm"
RPM_HASH = "ff3f7d25c6c0a0fc4e6988adc51276575a7e4646fdce7a68e946bc1439217a5dcdbff0a2d9c5946270e81643accbed8b3cc72c81d21e781d6f0090fb5dd08ce8"

RPROVIDES:${PN} += "python3.9dist-pysaml2 \
python39-pysaml2 \
python3dist-pysaml2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Paste \
python39-cryptography \
python39-defusedxml \
python39-importlib-resources \
python39-pyOpenSSL \
python39-python-dateutil \
python39-pytz \
python39-repoze.who \
python39-requests \
python39-six \
python39-xmlschema \
python39-zope.interface \
update-alternatives"

inherit rpm
