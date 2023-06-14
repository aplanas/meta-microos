SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "21.1.0"

RPM_NAME = "python311-service_identity-21.1.0-3.1.noarch.rpm"
RPM_HASH = "ce2938dc60de84596b932cb90fe092e4f8e826bcccda6119afbacaa6f782ff55b3d01bbe2cb7c291851fd49bb2b5219482f0955bcb9f0a230511f455b88ef3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-service-identity \
python311-service-identity \
python3dist-service-identity"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-cryptography \
python311-pyasn1 \
python311-pyasn1-modules \
python311-six"

inherit rpm
