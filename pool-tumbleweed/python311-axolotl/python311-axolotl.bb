SUMMARY = "Python port of libaxolotl-android"
DESCRIPTION = "This is a Python port of libsignal-protocol-java, originally written by Moxie \
Marlinspike."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "python311-axolotl-0.2.3-2.8.noarch.rpm"
RPM_HASH = "f2e42da5eea5e831204e37baeab61762ff451d3cc6c5cd09d2ee919b751dec620d4926b8a54c7394775cff50fc794203d6b237749cf232b37d571fcd56ad12f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-axolotl) \
python311-axolotl \
python3dist(python-axolotl)"

RDEPENDS:${PN} += "python(abi) \
python311-axolotl-curve25519 \
python311-cryptography \
python311-protobuf"

inherit rpm
