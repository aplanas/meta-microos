SUMMARY = "Python port of libaxolotl-android"
DESCRIPTION = "This is a Python port of libsignal-protocol-java, originally written by Moxie \
Marlinspike."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "python310-axolotl-0.2.3-2.10.noarch.rpm"
RPM_HASH = "42abf3558c57b4b2a54b37103cbc0504ee038d8a42e97570c928694006aa944d4d638fdd7e9ae6539290aa351be6fc98c1c26715fcaee2890206ce351399b173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-axolotl \
python310-axolotl \
python3dist-python-axolotl"

RDEPENDS:${PN} += "python-abi \
python310-axolotl-curve25519 \
python310-cryptography \
python310-protobuf"

inherit rpm
