SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.103.0"

RPM_NAME = "python310-oci-sdk-2.103.0-1.1.noarch.rpm"
RPM_HASH = "0ff45460669fc0bfc7e3e5a4e237355958693176bd9f70e678876bfa3bc38eae0631561aa16c942e47f84e7aad8f76ba88c455f87142f67ea05a20a12b4134b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oci \
python3-oci-sdk \
python3.10dist(oci) \
python310-oci \
python310-oci-sdk \
python3dist(oci)"

RDEPENDS:${PN} += "python(abi) \
python310-PyJWT \
python310-certifi \
python310-circuitbreaker \
python310-cryptography \
python310-httpsig_cffi \
python310-pyOpenSSL \
python310-python-dateutil \
python310-pytz \
python310-requests \
python310-six \
python310-urllib3"

inherit rpm
