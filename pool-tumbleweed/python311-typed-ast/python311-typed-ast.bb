SUMMARY = "A fork of Python 2 and 3 ast modules with type comment support"
DESCRIPTION = "typed_ast is a Python 3 package that provides a Python 2.7 and Python 3 \
parser similar to the standard ast library. Unlike ast, the parsers in \
typed_ast include PEP 484 type comments and are independent of the version of \
Python under which they are run. The typed_ast parsers produce the standard \
Python AST (plus type comments), and are both fast and correct, as they are \
based on the CPython 2.7 and 3.6 parsers."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "python311-typed-ast-1.5.4-2.3.aarch64.rpm"
RPM_HASH = "fa80ba7fe50a10f56f835b1c016d1f83a87c51a80c1324ef2661cd7e4c74fbd0906770fcae924ea37092aed74a28a64c6f8ce6b7da36dfe6448fdecf41738f20"

RPROVIDES:${PN} += "python3-typed-ast \
python3.11dist-typed-ast \
python311-typed-ast \
python3dist-typed-ast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
