SUMMARY = "A curve25519 Python wrapper with Ed25519 signatures"
DESCRIPTION = "This is a Python wrapper for the curve25519 library with Ed25519 \
signatures."
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "0.4.1.2"

RPM_NAME = "python311-axolotl-curve25519-0.4.1.2-1.7.aarch64.rpm"
RPM_HASH = "6fc5b146f84832967458d4bb9b50a5c287af52188b7819aa5b37596e4bda5bb4b5c3a07e12e7703b5f0def49b1dda4bdd0eb743179736d298460000c41a0ad56"

RPROVIDES:${PN} += "python3.11dist(python-axolotl-curve25519) \
python311-axolotl-curve25519 \
python311-axolotl-curve25519(aarch-64) \
python3dist(python-axolotl-curve25519)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
