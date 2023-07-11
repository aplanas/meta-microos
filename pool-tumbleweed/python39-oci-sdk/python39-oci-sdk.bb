SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.105.0"

RPM_NAME = "python39-oci-sdk-2.105.0-1.1.noarch.rpm"
RPM_HASH = "ab916596b0a77027de2b3b9ca58d20f5ef76cb4c025adbf918d904a7527709bfc25f59970427071371f8787f974c82fe04c50a653bbd61a5e5178e21561a7cac"
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
