SUMMARY = "Strong cryptography support for PySNMP (SNMP library for Python)"
DESCRIPTION = "Strong cryptography support for PySNMP (SNMP library for Python)"
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python310-pysnmpcrypto-0.0.4-1.1.noarch.rpm"
RPM_HASH = "2e505728855a76f6bc5ce3e9549cacb70e71fd7461c7df7013129dbf2d0829f973e5020a4df08a9002396df08bc234811bb739df7d700d8fc4ea6ee3c4288ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysnmpcrypto \
python310-pysnmpcrypto \
python3dist-pysnmpcrypto"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
