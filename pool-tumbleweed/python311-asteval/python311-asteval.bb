SUMMARY = "Safe, minimalistic evaluator of python expression using ast module"
DESCRIPTION = "ASTEVAL provides a numpy-aware, safe(ish) 'eval' function \
 \
Emphasis is on mathematical expressions, and so numpy ufuncs \
are used if available.  Symbols are held in the Interpreter \
symbol table 'symtable':  a simple dictionary supporting a \
simple, flat namespace. \
 \
Expressions can be compiled into ast node for later evaluation, \
using the values in the symbol table current at evaluation time."
LICENSE = "MIT"

PV = "0.9.31"

RPM_NAME = "python311-asteval-0.9.31-1.1.noarch.rpm"
RPM_HASH = "66b67bb1885dc5cc8bf56ae9a737a920d0e1fcb3b982bc7db1c2312e0f7293b45c9085977d087ee0b1fa9efc8d92192859c5d5633b94f78a8da7f6f09a58d3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asteval \
python3.11dist-asteval \
python311-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
