SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python311-service_identity-23.1.0-1.1.noarch.rpm"
RPM_HASH = "499c87cf8dde77c4a401fb9b0dd1c6fd5e9935d8efe41db525877dfacb7d6eb2eaac5af18ef649049d2c188cff5fe3ff3508d13d43f49fbf12bd197b28366372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-service-identity \
python3.11dist-service-identity \
python311-service-identity \
python3dist-service-identity"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-cryptography \
python311-pyasn1 \
python311-pyasn1-modules \
python311-six"

inherit rpm
