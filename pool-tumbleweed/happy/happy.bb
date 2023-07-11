SUMMARY = "Happy is a parser generator for Haskell"
DESCRIPTION = "Happy is a parser generator for Haskell. Given a grammar specification in BNF, \
Happy generates Haskell code to parse the grammar. Happy works in a similar way \
to the 'yacc' tool for C."
LICENSE = "BSD-2-Clause"

PV = "1.20.1.1"

RPM_NAME = "happy-1.20.1.1-1.3.aarch64.rpm"
RPM_HASH = "54850a2ddac9cc09f9bbebefa24c5eadcf39b6ba99725b1b7bdfd4f207e7ec53433d29aa9989505bc4069cf1fbd9ba2275f560668b4f99da59f7f5592800ed3c"

RPROVIDES:${PN} += "happy"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
