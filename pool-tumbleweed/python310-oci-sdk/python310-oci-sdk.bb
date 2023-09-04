SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.110.1"

RPM_NAME = "python310-oci-sdk-2.110.1-1.1.noarch.rpm"
RPM_HASH = "9158eb4b42806acc03b384758c46f6656fa2f74dac43de4020894692e9e8687dba2ce6894179827e86897f61a7973f00716a8c93fc5c76b499e742ac602878ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oci \
python310-oci \
python310-oci-sdk \
python3dist-oci"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-certifi \
python310-circuitbreaker \
python310-cryptography \
python310-httpsig-cffi \
python310-pyOpenSSL \
python310-python-dateutil \
python310-pytz \
python310-requests \
python310-six \
python310-urllib3"

inherit rpm
