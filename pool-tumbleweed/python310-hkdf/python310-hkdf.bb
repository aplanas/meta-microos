SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python310-hkdf-0.0.3-2.17.noarch.rpm"
RPM_HASH = "dd66d411721be918af446dab2f27306efe322754dc56a9055d67526a9d20b9703596f7080f89d3462b10c61761cea92ff6b16e11fe715551f4e9e472cbfd5ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hkdf \
python3.10dist-hkdf \
python310-hkdf \
python3dist-hkdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
