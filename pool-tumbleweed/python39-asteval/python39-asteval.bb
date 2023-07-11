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

PV = "0.9.29"

RPM_NAME = "python39-asteval-0.9.29-1.5.noarch.rpm"
RPM_HASH = "f9a78b9e53a4a92dfe068cdfb05690937d665cd6f5c3cbea9488c544c986a589316f8d13dbff8318e3fe3238c6a232582c31dfd80a53681de6c50adf9097681f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asteval \
python39-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
