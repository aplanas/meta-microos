SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python39-service_identity-23.1.0-1.1.noarch.rpm"
RPM_HASH = "b50e8c1b18dc61ebf17fbf663e6cf0b29e357a251228b7683a4d9533b9f954aa756d3ff7b6a1e3aeeb00127f1736b0771fa1fa5bf9bd6feef4d334b35ae4f404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-service-identity \
python39-service-identity \
python3dist-service-identity"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-cryptography \
python39-pyasn1 \
python39-pyasn1-modules \
python39-six"

inherit rpm
