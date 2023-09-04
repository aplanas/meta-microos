SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python311-parameterized-0.9.0-2.1.noarch.rpm"
RPM_HASH = "bc451ce04ea5616099c357afc331554eda99c11ec214a57521e1058a3fb97038fb959bd0a172a467330d1032ce663f946adc594949e4d62e3d19a5033bd69704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parameterized \
python3.11dist-parameterized \
python311-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
