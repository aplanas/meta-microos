SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.111.0"

RPM_NAME = "python39-oci-sdk-2.111.0-1.1.noarch.rpm"
RPM_HASH = "1636fe167ad516c2aaefd810e865f8cb9bd252ece1d5bdcafa267513ef247901466f60396d927c4c72133ae688f17bae25c1f05d44819faab8b1a170027d63e2"
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
