SUMMARY = "Strong cryptography support for PySNMP (SNMP library for Python)"
DESCRIPTION = "Strong cryptography support for PySNMP (SNMP library for Python)"
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python39-pysnmpcrypto-0.0.4-1.1.noarch.rpm"
RPM_HASH = "29ec4df6c7e023bc3cccf2537035be34678cd6783948b02fd4ee173eba15b8c328091e8469ff4d0893408170b10bbdfa9ccd4696e5b4254edfaa3d75383abca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysnmpcrypto \
python39-pysnmpcrypto \
python3dist-pysnmpcrypto"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
