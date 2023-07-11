SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python310-libcst-0.4.9-2.3.aarch64.rpm"
RPM_HASH = "fe932804514069c15347e9e4e2c7a43076fc37d8e6f347c6bd9ad0135e9c50195f569bc4ed9afec4b2a7acd21953455e1cf51e3bcc798ba287a91d1e560510a0"

RPROVIDES:${PN} += "python3.10dist-libcst \
python310-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python310-PyYAML \
python310-typing-extensions \
python310-typing-inspect"

inherit rpm
