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

RPM_NAME = "python310-license-expression-30.1.0-1.2.noarch.rpm"
RPM_HASH = "7d694ae12852bc64dddb1e98ec9169bc1cc17b2582fe775597e02f8bc77836e9ab28bdd3038406ad0748d6f606642e6ef10e243c69fafd0d3f97107a085d8ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-license-expression \
python3.10dist-license-expression \
python310-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python310-boolean.py"

inherit rpm
