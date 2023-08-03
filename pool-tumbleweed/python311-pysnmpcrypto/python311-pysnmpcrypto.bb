SUMMARY = "Strong cryptography support for PySNMP (SNMP library for Python)"
DESCRIPTION = "Strong cryptography support for PySNMP (SNMP library for Python)"
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python311-pysnmpcrypto-0.0.4-1.1.noarch.rpm"
RPM_HASH = "7a700a077905eafb156daf857b7b501b0cdacaacecac7c0aaae1a8af173e0c61c4e1f0f6e282e6f173a7eb9d19af35befdeb68fba9c502433c54538cf84a710d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysnmpcrypto \
python3.11dist-pysnmpcrypto \
python311-pysnmpcrypto \
python3dist-pysnmpcrypto"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
