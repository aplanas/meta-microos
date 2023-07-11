SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python39-ast-decompiler-0.7.0-1.6.noarch.rpm"
RPM_HASH = "8e9dbf06f258ac8043a0478a61174f958b1e02805c18e18c6ca1d21d580b67037905211cd2211afaa7f76606d55862359fc43ecc1bad7b797ec110f6b1c81835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ast-decompiler \
python39-ast-decompiler \
python3dist-ast-decompiler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
