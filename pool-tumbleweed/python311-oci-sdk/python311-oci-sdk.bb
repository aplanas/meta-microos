SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.105.0"

RPM_NAME = "python311-oci-sdk-2.105.0-1.1.noarch.rpm"
RPM_HASH = "e00b0d581338b466fd85ae513e08440abf9ae1a33d3e15ecdaf89f327f5e59c8d3507caaa15f663607be8469998e575a55b327e4a1aea1ab09e983fd51954ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oci \
python3-oci-sdk \
python3.11dist-oci \
python311-oci \
python311-oci-sdk \
python3dist-oci"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-certifi \
python311-circuitbreaker \
python311-cryptography \
python311-httpsig-cffi \
python311-pyOpenSSL \
python311-python-dateutil \
python311-pytz \
python311-requests \
python311-six \
python311-urllib3"

inherit rpm
