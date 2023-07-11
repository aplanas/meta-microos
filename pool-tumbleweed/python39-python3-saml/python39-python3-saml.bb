SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python39-python3-saml-1.15.0-1.3.noarch.rpm"
RPM_HASH = "62ab6eec78e6b502544e492569074aa2f1ff90c94a5dc8c7f21693325cbb281020295f2a53d62a564ddda6b6c77c00ee1202ae751ac69a9c135dac1927fb5368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python3-saml \
python39-python3-saml \
python3dist-python3-saml"

RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python-abi \
python39-isodate \
python39-lxml \
python39-xmlsec"

inherit rpm
