SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.106.0"

RPM_NAME = "python311-oci-sdk-2.106.0-1.1.noarch.rpm"
RPM_HASH = "fefc81e06e9c9bd01d2c3fab9118e91a2ed2048562c161a077de638443317addb47ba6c30f9d607bd38685baa4c7181340abea1c231e1703e858560de7515cfb"
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
