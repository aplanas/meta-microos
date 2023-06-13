SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python310-libcst-0.4.9-2.1.aarch64.rpm"
RPM_HASH = "cdb471276aab352feb37fefbdccbf4cdea27834bcb56c234f1ac9141a0587ac1f9269dca938f2c5964b3da688355277b7291a660ec10739e43cdc9f13c54570b"

RPROVIDES:${PN} += "python3-libcst \
python3.10dist(libcst) \
python310-libcst \
python310-libcst(aarch-64) \
python3dist(libcst)"

RDEPENDS:${PN} += "(python310-dataclasses if python310-base < 3.7) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi) \
python310-PyYAML \
python310-typing-inspect \
python310-typing_extensions"

inherit rpm
