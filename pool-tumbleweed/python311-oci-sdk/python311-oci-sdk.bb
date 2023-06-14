SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.103.0"

RPM_NAME = "python311-oci-sdk-2.103.0-1.1.noarch.rpm"
RPM_HASH = "eaaab3daba51f876ae86fff5906a52a6a415141bf8b18a95e31b0a312a5994fdbd30f97e4f658c2725f88b14ca3bea145e2ba5a55535bc1c6399a438ad539c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-oci \
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
