SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "python311-requirements-parser-0.2.0-6.3.noarch.rpm"
RPM_HASH = "5a7a07b701949a633ae52c9a916df01807db3476aad54e8db8edb5b2f3a12049136f23352ba122181051eda7bce83c5e1b3e731bd543499581a4051bb1634217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requirements-parser \
python3.11dist-requirements-parser \
python311-requirements-parser \
python3dist-requirements-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
