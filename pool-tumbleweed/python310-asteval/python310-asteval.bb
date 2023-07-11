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

RPM_NAME = "python310-asteval-0.9.29-1.5.noarch.rpm"
RPM_HASH = "81f8f7580be1bf0daec57cdcf1de2b434600632971974ae038ab518b17e5c083b3b5181a256df5d52a8289f52ce17b5c65abfa2dd429ef8bc52c4515b7256b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asteval \
python310-asteval \
python3dist-asteval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
