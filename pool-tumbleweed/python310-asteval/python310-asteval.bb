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

RPM_NAME = "python310-asteval-0.9.31-1.1.noarch.rpm"
RPM_HASH = "ce7651467a34a3019272592442bfa60edd08c7e3c7060b0154f528a97c44c64261e44e6ad8588ad3ad3671dc800fbb001e91f6ac55e08d75bfa110185fe734ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asteval \
python310-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
