SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "4.0"

RPM_NAME = "python311-boolean.py-4.0-1.5.noarch.rpm"
RPM_HASH = "da2bbf7d3a076f07c62b9aadaaefa7eb55d329499012646cc1a9f4faf8e4491a389cbdc2fef117140a999cbfb22c32d2b4c0323a8cf3414b24893ddbd585229e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boolean.py \
python3.11dist-boolean.py \
python311-boolean.py \
python3dist-boolean.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
