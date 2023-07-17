SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.106.0"

RPM_NAME = "python39-oci-sdk-2.106.0-1.1.noarch.rpm"
RPM_HASH = "4318d2b1e19629d80712ecfd568ecfc39e419d1eebdc38c3a83399bc6cdc135818985394bdf7de9549dbc6f16922e12825bb42f0e3d92f6b9b9847a885ee35d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oci \
python39-oci \
python39-oci-sdk \
python3dist-oci"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-certifi \
python39-circuitbreaker \
python39-cryptography \
python39-httpsig-cffi \
python39-pyOpenSSL \
python39-python-dateutil \
python39-pytz \
python39-requests \
python39-six \
python39-urllib3"

inherit rpm
