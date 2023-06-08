SUMMARY = "Semantic patch utility"
DESCRIPTION = "Coccinelle is a program matching and transformation engine which \
provides the language SmPL (Semantic Patch Language) for specifying \
desired matches and transformations in C code. [It does not recognize \
C++.] \
 \
Coccinelle performs collateral evolutions in software. Such \
evolutions comprise the changes that are needed in client code in \
response to evolutions in library APIs, and may include modifications \
such as renaming a function, adding a function argument whose value \
is somehow context-dependent, and reorganizing a data structure. \
Beyond collateral evolutions, Coccinelle is used for finding and \
fixing bugs in systems code."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "coccinelle-1.1.1-3.3.aarch64.rpm"
RPM_HASH = "08c06415656a3dfe12ba53981d60906b0d764b2707575bbf4b2fbe96126a8e7861dea91715d418f7f8859ccc4f3e8e62455829d3c6724619301bf19d5151af61"

RPROVIDES:${PN} += "coccinelle coccinelle(aarch-64)"
RDEPENDS:${PN} += "/bin/bash findutils grep libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre.so.1()(64bit) python(abi) python3-base which"

inherit rpm
