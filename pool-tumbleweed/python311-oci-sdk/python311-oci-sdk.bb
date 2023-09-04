SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.110.1"

RPM_NAME = "python311-oci-sdk-2.110.1-1.1.noarch.rpm"
RPM_HASH = "568356a7c3a77437152db14862134bd5f4b3466fc4d358f5c47fedafc424ea9fdd0b5ef5a73bdc46c4ac484adb1fd60266facbadc34a9cc40525f16a44b99083"
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
