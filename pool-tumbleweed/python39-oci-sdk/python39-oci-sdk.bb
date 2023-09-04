SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.110.1"

RPM_NAME = "python39-oci-sdk-2.110.1-1.1.noarch.rpm"
RPM_HASH = "c4d246617f7d040b342401ff6a586ff6ad05a1de89c28385061f83bfa4e34ab9d34eaa92e6c4bf3c05a8108a828681996147f4ade114b030905d5d8658cfe5dc"
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
