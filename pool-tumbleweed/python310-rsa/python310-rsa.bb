SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9"

RPM_NAME = "python310-rsa-4.9-2.1.noarch.rpm"
RPM_HASH = "c1212460d9822bd9f68e94225c544f2d56d810686de32ab53db8e9119f97d280456ab00e58083448da2dc7aa37bfbb0cb17aad7bc68d4835c201dfae73020bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rsa \
python3.10dist-rsa \
python310-rsa \
python3dist-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
coreutils \
python-abi \
python310-pyasn1"

inherit rpm
