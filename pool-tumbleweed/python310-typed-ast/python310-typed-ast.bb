SUMMARY = "A fork of Python 2 and 3 ast modules with type comment support"
DESCRIPTION = "typed_ast is a Python 3 package that provides a Python 2.7 and Python 3 \
parser similar to the standard ast library. Unlike ast, the parsers in \
typed_ast include PEP 484 type comments and are independent of the version of \
Python under which they are run. The typed_ast parsers produce the standard \
Python AST (plus type comments), and are both fast and correct, as they are \
based on the CPython 2.7 and 3.6 parsers."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "python310-typed-ast-1.5.4-2.3.aarch64.rpm"
RPM_HASH = "66ec8cf18e0860a1b3302f9b6df1d98e71a663a185f8b1be57d7355b285ceaf776ea65d46f1c0cf10424d91498e772a67741f1ce6d65b626142951ee2e4c7d01"

RPROVIDES:${PN} += "python3.10dist-typed-ast \
python310-typed-ast \
python3dist-typed-ast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
