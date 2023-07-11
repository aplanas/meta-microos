SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9"

RPM_NAME = "python311-rsa-4.9-2.3.noarch.rpm"
RPM_HASH = "6a1a580c77ef3bad6a51069c7f0402b598e1e15dd9940fcf29807d569a4e6132ad6570eeee2781f5367d2cf13bca3c7bdfd43543348c5b8608a6034db5226b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rsa \
python3.11dist-rsa \
python311-rsa \
python3dist-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
coreutils \
python-abi \
python311-pyasn1"

inherit rpm
