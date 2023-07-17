SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.106.0"

RPM_NAME = "python310-oci-sdk-2.106.0-1.1.noarch.rpm"
RPM_HASH = "f324bc9548339b49d01ac823445721b25ee85f549cf4a95a3602bcc4e982e9bfff5cc952c047d77224456ac0a43c2fa959bd5ebec264e37758a00441cd45779d"
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
