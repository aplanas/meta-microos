SUMMARY = "Python bindings to the Ed25519 public-key signature system"
DESCRIPTION = "Python bindings to the Ed25519 public-key signature system."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python310-ed25519-1.5-3.13.aarch64.rpm"
RPM_HASH = "07f2a62d2315889ddb1f31ebf32d4adde190aee3e61455ee75c700b463611e9c94091bacbe9813f01d729334d725a5dbd53a425fa8fff870ea83d525d9640af3"

RPROVIDES:${PN} += "python3.10dist-ed25519 \
python310-ed25519 \
python3dist-ed25519"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
