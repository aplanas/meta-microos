SUMMARY = "A curve25519 Python wrapper with Ed25519 signatures"
DESCRIPTION = "This is a Python wrapper for the curve25519 library with Ed25519 \
signatures."
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "0.4.1.2"

RPM_NAME = "python39-axolotl-curve25519-0.4.1.2-1.9.aarch64.rpm"
RPM_HASH = "83bde18aeff508ec8c985cb367dca29b231790e6819370d5452253df007ea0466facc72fb02fc33a968feefd4c2661c193cd5c8ab51739d2823f6cab90096a80"

RPROVIDES:${PN} += "python3.9dist-python-axolotl-curve25519 \
python39-axolotl-curve25519 \
python3dist-python-axolotl-curve25519"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
