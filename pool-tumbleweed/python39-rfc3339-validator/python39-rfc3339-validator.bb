SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python39-rfc3339-validator-0.1.4-3.3.noarch.rpm"
RPM_HASH = "ed1d2c9df5535edbf59c69d7dbdd83efc3a82b6713e183c934b03d4b9b9cbe07f45c54a96a8f42ee7a0f677ab357f2fa923e0fdb56f30b4f9096a2459a822a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rfc3339-validator \
python39-rfc3339-validator \
python3dist-rfc3339-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
