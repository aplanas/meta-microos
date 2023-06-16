SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "python39-pysaml2-7.2.1-2.4.aarch64.rpm"
RPM_HASH = "13ac131a383eef7f1960d7f90bc97490c5e9659ce7db3c6834809dec7e1eba80439e9e088e970e893beda5c54cab473529ced44ff7cfed5e6a72ff9c99fd1228"

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
