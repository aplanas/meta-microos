SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-base58-2.1.1-1.9.noarch.rpm"
RPM_HASH = "55e9fde9cf96e8ff4ba468386d851feb324cd9ebe061c97c09f32c903098f94b0eb3cfc4b6e04df5150b74ac41a5b6277be0a51aefbd29c9d33d042acd14c91e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-base58 \
python3.10dist(base58) \
python310-base58 \
python3dist(base58)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
