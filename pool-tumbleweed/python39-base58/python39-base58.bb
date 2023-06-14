SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-base58-2.1.1-1.9.noarch.rpm"
RPM_HASH = "454bb756aebe579e38d7538044aa037d86e0943c393acf363f965585ee54b115a58c6d44c2cec866fcd41a2708fc27164bf51d427e691a6cb55d91641cfeaf65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-base58 \
python39-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
