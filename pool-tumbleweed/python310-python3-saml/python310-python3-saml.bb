SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python310-python3-saml-1.15.0-1.1.noarch.rpm"
RPM_HASH = "ee8a9b3ce28b7ca899d4cbecb94813184e14759880f5effe65e3c19185f88b27e85a9ece451b9fb8a8bee4f31ccc512ccc0cf1ff4e2042b53bda2ae5451a00f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-saml \
python3.10dist-python3-saml \
python310-python3-saml \
python3dist-python3-saml"

RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python-abi \
python310-isodate \
python310-lxml \
python310-xmlsec"

inherit rpm
