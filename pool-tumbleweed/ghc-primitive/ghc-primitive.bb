SUMMARY = "Primitive memory-related operations"
DESCRIPTION = "This package provides various primitive memory-related operations."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-0.7.4.0-1.8.aarch64.rpm"
RPM_HASH = "9c9d95b6f650a2558cab164fecd7d1610bd182ec732c29d3bff5aa709a4c299dfcd780474e8e6aaa282fb9e3c0a3d4110ce831ad003beb18bfdab5fe0bc39258"

RPROVIDES:${PN} += "ghc-primitive \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
