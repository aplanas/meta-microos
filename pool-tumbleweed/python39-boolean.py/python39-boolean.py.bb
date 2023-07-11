SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "4.0"

RPM_NAME = "python39-boolean.py-4.0-1.5.noarch.rpm"
RPM_HASH = "43f187a1bdbf4ef6306c4f5d891ad7190b7f6a74f3fba37f1016741f5bc8e987db7855a915cb5085bbe004d95865f9d0a467c0a2f96090fd8d5770f6cb1ae154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-boolean.py \
python39-boolean.py \
python3dist-boolean.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
