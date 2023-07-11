SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python311-python3-saml-1.15.0-1.3.noarch.rpm"
RPM_HASH = "81a5047524192e43af2afadba2c1a6c2daad8a7c7f40c003ff8cbe09741236bfa3905876d7ac9fc043f445805c058bc966e9875599a76c08b4bc731b159d7082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-saml \
python3.11dist-python3-saml \
python311-python3-saml \
python3dist-python3-saml"

RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python-abi \
python311-isodate \
python311-lxml \
python311-xmlsec"

inherit rpm
