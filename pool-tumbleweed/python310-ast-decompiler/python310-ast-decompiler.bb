SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python310-ast-decompiler-0.7.0-1.4.noarch.rpm"
RPM_HASH = "7b2ec10ca2a5bca867164be1081ba30be436e70cf608c818e88a3faae6ff18d7abec58c4ab0866b49e98caa180fd5eb51161d05a3fd527a2c9e185828f5171ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ast-decompiler \
python3.10dist(ast-decompiler) \
python310-ast-decompiler \
python3dist(ast-decompiler)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
