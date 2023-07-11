SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python310-hkdf-0.0.3-2.18.noarch.rpm"
RPM_HASH = "13b5d8e36cbfedae74b2e8b0874caac02c995601dcea36003c5c6d19fe209f38f8f761eae45d19e44b13fd3e3522c176a318574dedff2ac12e6a9e0c7284ff7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hkdf \
python310-hkdf \
python3dist-hkdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
