SUMMARY = "A fork of Python 2 and 3 ast modules with type comment support"
DESCRIPTION = "typed_ast is a Python 3 package that provides a Python 2.7 and Python 3 \
parser similar to the standard ast library. Unlike ast, the parsers in \
typed_ast include PEP 484 type comments and are independent of the version of \
Python under which they are run. The typed_ast parsers produce the standard \
Python AST (plus type comments), and are both fast and correct, as they are \
based on the CPython 2.7 and 3.6 parsers."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "python39-typed-ast-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "1606c18cd66928ab826a4300acc073fe81397068de5b3d3b84855aece469da7ab75214a1bb2883132af55d06d39b4c94040e7855dc724c2bfb6269bea0d6a98f"

RPROVIDES:${PN} += "python3.9dist-typed-ast \
python39-typed-ast \
python3dist-typed-ast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
