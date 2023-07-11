SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.105.0"

RPM_NAME = "python310-oci-sdk-2.105.0-1.1.noarch.rpm"
RPM_HASH = "64a920f6d57f6c40f8c95126265583d876767c98811d93e4e469a5e86837485e7ba679f3ea3940a56fbf5a88a390b8bc1d2245599a649ede0dabf9d84e639f4d"
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
