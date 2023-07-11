SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python311-hkdf-0.0.3-2.18.noarch.rpm"
RPM_HASH = "06d27ce34eb5e85af7d6ac408eb15f8f6757f61a5d8522b081354f798e2aebe4ae3e3e93a48201ae90f1becbf9e7f650e46435a340a3b17f34e1f8bef82455bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hkdf \
python3.11dist-hkdf \
python311-hkdf \
python3dist-hkdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
