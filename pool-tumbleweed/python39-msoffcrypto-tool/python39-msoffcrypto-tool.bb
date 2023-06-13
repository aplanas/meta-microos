SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "4.10.2"

RPM_NAME = "python39-msoffcrypto-tool-4.10.2-3.14.noarch.rpm"
RPM_HASH = "dbb6c4c148648b9e6e5666ee7954050b5f51d3a3617cdec35cc5848b8af71d3d5c006edfea134b51d1c553a5d43f834ea9fb6c8e23581dfd8e81567d446ed102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(msoffcrypto-tool) \
python39-msoffcrypto-tool \
python3dist(msoffcrypto-tool)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-cryptography \
python39-olefile \
python39-setuptools \
update-alternatives"

inherit rpm
