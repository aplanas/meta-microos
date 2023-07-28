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

RPM_NAME = "python39-asteval-0.9.31-1.1.noarch.rpm"
RPM_HASH = "6a7b60b93f20104798bb698874644f01c38acf0b301203cd0e0882f1d85f748aeb206e0267877ebf86f26fefc33c8e6ee49e8cdbf75ecc3af2c91055a4625873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asteval \
python39-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
