SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python39-libcst-0.4.9-2.3.aarch64.rpm"
RPM_HASH = "5831a6215ea69e3c1d33f0557c0abaf55f370bced0485aa1ad7b6d91981e6482c748eab71bab33e69f6d6f48b3c60db9574346697b0196eb1c5f763b16e93706"

RPROVIDES:${PN} += "python3.9dist-libcst \
python39-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python39-PyYAML \
python39-typing-extensions \
python39-typing-inspect"

inherit rpm
