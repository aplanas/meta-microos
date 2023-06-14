SUMMARY = "Library to parse, compare, simplify and normalize license expressions"
DESCRIPTION = "This module defines a mini language to parse, validate, simplify, normalize and \
compare license expressions using a boolean logic engine. \
 \
This supports SPDX license expressions and also accepts other license naming \
conventions and license identifiers aliases to resolve and normalize licenses. \
 \
Using boolean logic, license expressions can be tested for equality, \
containment, equivalence and can be normalized or simplified."
LICENSE = "Apache-2.0"

PV = "30.1.0"

RPM_NAME = "python311-license-expression-30.1.0-1.2.noarch.rpm"
RPM_HASH = "b46360d7f7ad73f1dba933467d9bf09ff24441a4c1b5cb0c95055f468575a7cfa94db612d928d6f6dfaf68e84155ff67ba2d364a4df5fb1b36290d8a743438f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-license-expression \
python311-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python311-boolean.py"

inherit rpm
