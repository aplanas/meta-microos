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

RPM_NAME = "python311-license-expression-30.1.0-1.4.noarch.rpm"
RPM_HASH = "f8d53b5993242ff46bd8cac1bdcd8a9ed37665e7abaaf029e4c67318807fe4af425f623cb8366c355bb3b4cf880dae755f959b1747f8d8a3cdd8fb0388209197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-license-expression \
python3.11dist-license-expression \
python311-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python311-boolean.py"

inherit rpm
