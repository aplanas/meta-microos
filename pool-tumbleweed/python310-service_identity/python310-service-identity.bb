SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python310-service_identity-23.1.0-1.1.noarch.rpm"
RPM_HASH = "521f4df0fa49343734ca7665642d9c3127af4b3969306904a80968e46ec4c9af6e57064ea9c029e339a60e66fbd85259492fe00c7991aee634aa5feee6c05bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-service-identity \
python310-service-identity \
python3dist-service-identity"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-cryptography \
python310-pyasn1 \
python310-pyasn1-modules \
python310-six"

inherit rpm
