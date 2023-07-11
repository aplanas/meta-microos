SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9"

RPM_NAME = "python39-rsa-4.9-2.3.noarch.rpm"
RPM_HASH = "96a6df8561b7607cf86d8f2c64ad4dfca177f50123b45d5150635aba56b9c2695f38d20d7809f5689858ca582ef483158387f28b1737c28eeebfa4a4091794c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rsa \
python39-rsa \
python3dist-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
coreutils \
python-abi \
python39-pyasn1"

inherit rpm
