SUMMARY = "A fork of Python 2 and 3 ast modules with type comment support"
DESCRIPTION = "typed_ast is a Python 3 package that provides a Python 2.7 and Python 3 \
parser similar to the standard ast library. Unlike ast, the parsers in \
typed_ast include PEP 484 type comments and are independent of the version of \
Python under which they are run. The typed_ast parsers produce the standard \
Python AST (plus type comments), and are both fast and correct, as they are \
based on the CPython 2.7 and 3.6 parsers."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "python39-typed-ast-1.5.4-2.3.aarch64.rpm"
RPM_HASH = "a45239f1e05f3d2524481327462214ec117446d67af25afc8630699b2be0a08470b1d385afc47d5614f867f4d5cd382de3208e08ee17601c77384d1aaaa5aa01"

RPROVIDES:${PN} += "python3.9dist-typed-ast \
python39-typed-ast \
python3dist-typed-ast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
