SUMMARY = "A curve25519 Python wrapper with Ed25519 signatures"
DESCRIPTION = "This is a Python wrapper for the curve25519 library with Ed25519 \
signatures."
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "0.4.1.2"

RPM_NAME = "python310-axolotl-curve25519-0.4.1.2-1.9.aarch64.rpm"
RPM_HASH = "b4317b08fe3295a3f41e164da45439043008d6ee6d405dad0026701c6aa696c5f6c46b405ed14d3732592d2c9a71a17e5bdb6a548064e8da23ad63e3e85ae5c3"

RPROVIDES:${PN} += "python3.10dist-python-axolotl-curve25519 \
python310-axolotl-curve25519 \
python3dist-python-axolotl-curve25519"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
