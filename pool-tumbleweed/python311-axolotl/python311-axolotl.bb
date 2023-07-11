SUMMARY = "Python port of libaxolotl-android"
DESCRIPTION = "This is a Python port of libsignal-protocol-java, originally written by Moxie \
Marlinspike."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "python311-axolotl-0.2.3-2.10.noarch.rpm"
RPM_HASH = "0e7af56120adfc2326274adfed1bc705ed9a476bf31ea1c7925592fdb761ff9fd3c2d7673ae41fd1fc2cff786f0af854ed9634bb83178e506a791544cef4ba55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-axolotl \
python3.11dist-python-axolotl \
python311-axolotl \
python3dist-python-axolotl"

RDEPENDS:${PN} += "python-abi \
python311-axolotl-curve25519 \
python311-cryptography \
python311-protobuf"

inherit rpm
