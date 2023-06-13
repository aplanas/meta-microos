SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "21.1.0"

RPM_NAME = "python310-service_identity-21.1.0-3.1.noarch.rpm"
RPM_HASH = "6dcc866df4d394f62a55b87cdcd18dfe30a37761ed76f9d5fe33b1deecdb855667d81202c9f58c4e1cd147a71670c33482235147a2340f744510743741b06df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-service_identity \
python3.10dist(service-identity) \
python310-service_identity \
python3dist(service-identity)"

RDEPENDS:${PN} += "python(abi) \
python310-attrs \
python310-cryptography \
python310-pyasn1 \
python310-pyasn1-modules \
python310-six"

inherit rpm
