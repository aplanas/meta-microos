SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "python311-pysaml2-7.2.1-2.4.aarch64.rpm"
RPM_HASH = "dda46d210cdbb18a11fe3f1cc1582702652c9290937b90ec5c99405bb39e9ca737b4aad6c9f7298df54058424bd77ce3c1b4521be16b3e2f76edb15cd5a7d783"

RPROVIDES:${PN} += "python3.11dist-pysaml2 \
python311-pysaml2 \
python3dist-pysaml2"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Paste \
python311-cryptography \
python311-defusedxml \
python311-importlib-resources \
python311-pyOpenSSL \
python311-python-dateutil \
python311-pytz \
python311-repoze.who \
python311-requests \
python311-six \
python311-xmlschema \
python311-zope.interface \
update-alternatives"

inherit rpm
