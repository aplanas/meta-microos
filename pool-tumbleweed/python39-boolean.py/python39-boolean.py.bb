SUMMARY = "Module to define boolean algebras and create/parse boolean expressions"
DESCRIPTION = "'boolean.py' is a library implementing a boolean algebra. It defines \
two base elements, TRUE and FALSE, and a Symbol class that can take on one of \
these two values. Calculations are done in terms of AND, OR and NOT - other \
compositions like XOR and NAND are not implemented but can be emulated with \
AND or and NOT. Expressions are constructed from parsed strings or in Python."
LICENSE = "BSD-2-Clause"

PV = "4.0"

RPM_NAME = "python39-boolean.py-4.0-1.3.noarch.rpm"
RPM_HASH = "beb9491f7249dda440cc1f10f2d8626445df5a04e8d1760bef83850b5b6704712c592f520eb4efaf1943a6f1876dee09c1f9720d562761e2a81e6eadeb46cfa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(boolean.py) \
python39-boolean.py \
python3dist(boolean.py)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
