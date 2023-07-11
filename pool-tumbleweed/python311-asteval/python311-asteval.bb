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

RPM_NAME = "python311-asteval-0.9.29-1.5.noarch.rpm"
RPM_HASH = "42f665d0682cb66fe48911da9cf5564ab21a00420a6b42a47ce951199f21507d87e77a0c44a236459c6de504e63e58f6973ec9442327e55f9258608f311807b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asteval \
python3.11dist-asteval \
python311-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
