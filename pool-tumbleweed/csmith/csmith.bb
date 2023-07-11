SUMMARY = "Random C code generator"
DESCRIPTION = "Csmith is a tool that can generate random C programs that statically and \
dynamically conform to the C99 standard. It is useful for stress-testing \
compilers, static analyzers, and other tools that process C code."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "csmith-2.3.0-1.24.aarch64.rpm"
RPM_HASH = "b18d669ef80a62f0e97df594897361c1cd275321be86e41204c34679b58c8cc023c77e480972658738f1a46aac399d5c2d3e420097b37abc42176aa55f089c9c"

RPROVIDES:${PN} += "csmith"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
