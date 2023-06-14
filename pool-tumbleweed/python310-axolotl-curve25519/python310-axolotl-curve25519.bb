SUMMARY = "A curve25519 Python wrapper with Ed25519 signatures"
DESCRIPTION = "This is a Python wrapper for the curve25519 library with Ed25519 \
signatures."
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "0.4.1.2"

RPM_NAME = "python310-axolotl-curve25519-0.4.1.2-1.7.aarch64.rpm"
RPM_HASH = "92aafed8750c959178d180d24b9da1a3aee91b99515c9f9d750fc32df16735d038580aa13db2c14441c5239da792f7c5a3547c94267baedf92e96351f856ea09"

RPROVIDES:${PN} += "python3-axolotl-curve25519 \
python3.10dist-python-axolotl-curve25519 \
python310-axolotl-curve25519 \
python3dist-python-axolotl-curve25519"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
