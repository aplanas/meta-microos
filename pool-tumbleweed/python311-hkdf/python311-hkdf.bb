SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python311-hkdf-0.0.3-2.17.noarch.rpm"
RPM_HASH = "18ac7a19f7cdf4916b26bfedb907f0004a073f08c11a6183d096bff640757627bd722a3d9c6103d8fc2d0f108fdd6809adc20111dc97319960b7d32754882ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hkdf) \
python311-hkdf \
python3dist(hkdf)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
