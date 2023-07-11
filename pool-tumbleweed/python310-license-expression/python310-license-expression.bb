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

RPM_NAME = "python310-license-expression-30.1.0-1.4.noarch.rpm"
RPM_HASH = "680bcbe0ec0df8b143ab42db624b07ef3936c17320875400f45078ed066d561d35ef7e61bf66802b444075901347bbac85b8d0fa506c9c3108bfb1561c1e29a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-license-expression \
python310-license-expression \
python3dist-license-expression"

RDEPENDS:${PN} += "python-abi \
python310-boolean.py"

inherit rpm
