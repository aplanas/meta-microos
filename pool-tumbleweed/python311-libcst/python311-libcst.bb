SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python311-libcst-0.4.9-2.1.aarch64.rpm"
RPM_HASH = "66ca4390b0743974be641334967a0615382756c1da62ba3c787242e29e93c6807960f3394df8d40c55d2808d671403f923234fddd1c8aabedb373abf366103e7"

RPROVIDES:${PN} += "python3.11dist-libcst \
python311-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "-python311-dataclasses if python311-base < 3.7 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python311-PyYAML \
python311-typing-extensions \
python311-typing-inspect"

inherit rpm
