SUMMARY = "Swagger Schema validation"
DESCRIPTION = "Validation tooling for Swagger 2.0 specifications."
LICENSE = "MIT"

PV = "6.14.1"

RPM_NAME = "python311-flex-6.14.1-5.3.noarch.rpm"
RPM_HASH = "647d72927a4350ccfc139acb2be8e3112aeda639d5730fcc0181aa7a44a24b2a8108852ac0578378639d7aba7f4ae3a3469196f86bdde8a860fe791a5b7fedbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flex \
python3.11dist-flex \
python311-flex \
python3dist-flex"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
python311-jsonpointer \
python311-requests \
python311-rfc3987 \
python311-six \
python311-strict-rfc3339 \
python311-validate-email \
update-alternatives"

inherit rpm
