SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python311-ast-decompiler-0.7.0-1.4.noarch.rpm"
RPM_HASH = "988553be599e40063134b61715511288b18d1df81a47bae4017c1cc57c9f0dfbd64d6948e6c266ea9ef8afd4f6ca55ca76e0ae088b59c5d0c3205a8eb2b7dcfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ast-decompiler) \
python311-ast-decompiler \
python3dist(ast-decompiler)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
