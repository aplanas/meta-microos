SUMMARY = "Happy is a parser generator for Haskell"
DESCRIPTION = "Happy is a parser generator for Haskell. Given a grammar specification in BNF, \
Happy generates Haskell code to parse the grammar. Happy works in a similar way \
to the 'yacc' tool for C."
LICENSE = "BSD-2-Clause"

PV = "1.20.1.1"

RPM_NAME = "happy-1.20.1.1-1.2.aarch64.rpm"
RPM_HASH = "3ff6e0f47392da18ada0ec82b7e6ef72c0d523b59bb3d86bbe52dfd9329c975c3ee8a0defec804d01335598612fae959fb021360797a2336037deaca891f7b3c"

RPROVIDES:${PN} += "happy"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
