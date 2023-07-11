SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "python311-pysaml2-7.2.1-3.3.aarch64.rpm"
RPM_HASH = "02c2140bd352d53fc860399a6fd4ec00a1a23ade9d6cdcb0f2b3a45a4cad57147219bb0167466a6add2e66e0faefee5765e639f5c5cf3b8a05e1883753dd2192"

RPROVIDES:${PN} += "python3-pysaml2 \
python3.11dist-pysaml2 \
python311-pysaml2 \
python3dist-pysaml2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
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
