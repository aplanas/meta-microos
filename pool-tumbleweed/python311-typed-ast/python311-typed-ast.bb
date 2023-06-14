SUMMARY = "A fork of Python 2 and 3 ast modules with type comment support"
DESCRIPTION = "typed_ast is a Python 3 package that provides a Python 2.7 and Python 3 \
parser similar to the standard ast library. Unlike ast, the parsers in \
typed_ast include PEP 484 type comments and are independent of the version of \
Python under which they are run. The typed_ast parsers produce the standard \
Python AST (plus type comments), and are both fast and correct, as they are \
based on the CPython 2.7 and 3.6 parsers."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "python311-typed-ast-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "ab45755715001625c65a7268f272c40a96473301e77efb5304d8f93568fa10c1f1652566e32f09194dab0eadcc56203e80b5a21a0ad433119b1442158293d372"

RPROVIDES:${PN} += "python3.11dist-typed-ast \
python311-typed-ast \
python3dist-typed-ast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
