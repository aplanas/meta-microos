SUMMARY = "Python port of libaxolotl-android"
DESCRIPTION = "This is a Python port of libsignal-protocol-java, originally written by Moxie \
Marlinspike."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "python310-axolotl-0.2.3-2.8.noarch.rpm"
RPM_HASH = "1abe91e1824f3c7c3137a3625fb82a1c59a680956ed543390f7f950e0881f05b8eab93c352dadc4a56be8c0ec3328097d2c295b38e39bff6fe5f7a035071d268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-axolotl \
python3.10dist-python-axolotl \
python310-axolotl \
python3dist-python-axolotl"

RDEPENDS:${PN} += "python-abi \
python310-axolotl-curve25519 \
python310-cryptography \
python310-protobuf"

inherit rpm
