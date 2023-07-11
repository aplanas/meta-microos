SUMMARY = "A curve25519 Python wrapper with Ed25519 signatures"
DESCRIPTION = "This is a Python wrapper for the curve25519 library with Ed25519 \
signatures."
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "0.4.1.2"

RPM_NAME = "python311-axolotl-curve25519-0.4.1.2-1.9.aarch64.rpm"
RPM_HASH = "dbdfca951595ad510ca22f57e05fc4f09cd8c6221fb0d3291004a6e5f958557c5b1d4f6c5a317b15e969f864cc7ef4f999e8940033afa840a1b747092f9f1e23"

RPROVIDES:${PN} += "python3-axolotl-curve25519 \
python3.11dist-python-axolotl-curve25519 \
python311-axolotl-curve25519 \
python3dist-python-axolotl-curve25519"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
