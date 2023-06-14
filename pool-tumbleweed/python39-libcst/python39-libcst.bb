SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python39-libcst-0.4.9-2.1.aarch64.rpm"
RPM_HASH = "1c56c32fa347659d8f802bc091892c1f189852f28a78067ddcf9a68ec74acf0bb48a6823f62ebeab163cc0baaf602129420b45b9ca9685f34b4ff0fc57f07bea"

RPROVIDES:${PN} += "python3.9dist-libcst \
python39-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "-python39-dataclasses if python39-base < 3.7 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python39-PyYAML \
python39-typing-extensions \
python39-typing-inspect"

inherit rpm
