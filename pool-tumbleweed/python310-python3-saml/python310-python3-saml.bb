SUMMARY = "Python SAML support"
DESCRIPTION = "Python SAML support for your Python 2 or 3 software. \
 \
SAML is an XML-based standard for web browser single sign-on and is \
defined by the OASIS Security Services Technical Committee."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python310-python3-saml-1.15.0-1.3.noarch.rpm"
RPM_HASH = "d1f34cd4ca090c3f68623c0a211f64c303f615ff256f427013a3e88d75495dc19e28418e1140b88db97ca011756c0876364d1c2f0a0fb7117ac7ad7d49367b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python3-saml \
python310-python3-saml \
python3dist-python3-saml"

RDEPENDS:${PN} += "libxmlsec1-openssl1 \
python-abi \
python310-isodate \
python310-lxml \
python310-xmlsec"

inherit rpm
