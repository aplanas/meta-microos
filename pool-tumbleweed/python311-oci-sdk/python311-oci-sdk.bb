SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.111.0"

RPM_NAME = "python311-oci-sdk-2.111.0-1.1.noarch.rpm"
RPM_HASH = "f29dc4f7f9facda4fd2aed31e8e15b346c1d6e2c6edb1b6620eb6281c468973596cba61524e8255b1a15a78c1e355776da19865ca7752f45574397341c355416"
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
