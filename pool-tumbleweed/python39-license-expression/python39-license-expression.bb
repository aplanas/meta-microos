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

RPM_NAME = "python39-license-expression-30.1.0-1.4.noarch.rpm"
RPM_HASH = "805664be2a27433edbcc1870288acea7b108e617dea58e24518f18f4d73e36d96e431ced7f0ddbafa20734de643d5d99b5dc4c95d46befa1a6630fd95164c238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-license-expression \
python39-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python39-boolean.py"

inherit rpm
