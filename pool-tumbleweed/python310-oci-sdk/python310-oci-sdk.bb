SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.111.0"

RPM_NAME = "python310-oci-sdk-2.111.0-1.1.noarch.rpm"
RPM_HASH = "e9e64d8921ed0843d89a9c37c2af0322a7cd873689fc37a5718d3fc61e015bf4d088032321b586d8c739d799db46c84a5f48ad59a677fff9f9ab09841c9781ba"
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
