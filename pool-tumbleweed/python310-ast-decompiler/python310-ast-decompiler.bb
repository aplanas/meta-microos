SUMMARY = "Python module to decompile AST to Python code"
DESCRIPTION = "Python module to decompile AST to Python code"
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python310-ast-decompiler-0.7.0-1.6.noarch.rpm"
RPM_HASH = "9e21a4d4930bc099a54580cc4be0673aeb2e8e700d13fde74a2ad312abb8d9f680ce2dc692e3fcdb2d9a61e04b37d2fe8240a2de37679529f4de9a617f5ec00f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ast-decompiler \
python310-ast-decompiler \
python3dist-ast-decompiler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
