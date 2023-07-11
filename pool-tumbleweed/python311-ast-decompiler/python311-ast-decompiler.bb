SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python311-ast-decompiler-0.7.0-1.6.noarch.rpm"
RPM_HASH = "80d310a597862e37d847329b708981a0cf868433a33d4b8d4c3914aa1468b5cb8321bb91720a6e3be37ad1d3d030bc75954b29b05f7bb76b9afbb8aec8cf9e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ast-decompiler \
python3.11dist-ast-decompiler \
python311-ast-decompiler \
python3dist-ast-decompiler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
