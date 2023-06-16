SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-base58-2.1.1-1.9.noarch.rpm"
RPM_HASH = "e2cacaa3bd4169f206b3c50e292b63c17bee70687ee4db165e5c0edf7c71b6aa71aaf908fad194b352ecdf00bffbfb210725223887ae8eecfd3f5879773d8952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-base58 \
python311-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
