SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9"

RPM_NAME = "python310-rsa-4.9-2.3.noarch.rpm"
RPM_HASH = "bc2bed6511f37585dde9614b650931e8728c28d416c17b521df0819c0fb2a55da43160124f254955248704179179c2802eb4aa271d81de1d4b01e1398d0d7640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rsa \
python310-rsa \
python3dist-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
coreutils \
python-abi \
python310-pyasn1"

inherit rpm
