SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-base58-2.1.1-1.11.noarch.rpm"
RPM_HASH = "da11cf7e25aac679b6bcaeb61797546f1e83a33071c4604aba1cbc7c6e022566eec0ddc6c12ac0400afb23a93ce8a3241583aa55c247699ad2a24c9a40a0c76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-base58 \
python310-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
