SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "4.0"

RPM_NAME = "python310-boolean.py-4.0-1.5.noarch.rpm"
RPM_HASH = "7029df46b245fa55dcdc00d67e068ee1c52f38a1dda6faafaeab730feef9fb0feb96d5d6abdc251551b66dfd7839f85320ada6b80e8d6294131e2047ce0298d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-boolean.py \
python310-boolean.py \
python3dist-boolean.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
