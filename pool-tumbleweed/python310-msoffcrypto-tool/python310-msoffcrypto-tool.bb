SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "4.10.2"

RPM_NAME = "python310-msoffcrypto-tool-4.10.2-3.16.noarch.rpm"
RPM_HASH = "e92ff8ab675e04653d0b79905e023555700d844d17c75dfab311483418211306a2a1a7efcb1e5924080b7ffd8dbb1dd49fe27f06d4b8333a16fe13f511d26a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msoffcrypto-tool \
python310-msoffcrypto-tool \
python3dist-msoffcrypto-tool"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cryptography \
python310-olefile \
python310-setuptools \
update-alternatives"

inherit rpm
