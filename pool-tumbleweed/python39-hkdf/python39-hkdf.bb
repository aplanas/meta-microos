SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python39-hkdf-0.0.3-2.18.noarch.rpm"
RPM_HASH = "df8efaf85e3941e9e47706ec6422bb747c397ac3a15d30543a6012c1c940e6225052edc3b23d7209369c8e402b1e84a41accb9cbc860680e53f65822ce69c1e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hkdf \
python39-hkdf \
python3dist-hkdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
