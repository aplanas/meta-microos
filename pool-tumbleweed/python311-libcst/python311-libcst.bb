SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python311-libcst-0.4.9-2.3.aarch64.rpm"
RPM_HASH = "d973bf252e5eef8a501b45fc38b7faa1b5ac6c8d0aef67712a40d5db2b108fc590eb0b4ad7e56c0b3ae4c1304494f354cdd07c0036a30b478292659e650d0cb1"

RPROVIDES:${PN} += "python3-libcst \
python3.11dist-libcst \
python311-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python311-PyYAML \
python311-typing-extensions \
python311-typing-inspect"

inherit rpm
