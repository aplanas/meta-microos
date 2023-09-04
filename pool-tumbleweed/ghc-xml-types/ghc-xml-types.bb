SUMMARY = "Basic types for representing XML"
DESCRIPTION = "Basic types for representing XML. \
 \
The idea is to have a full set of appropriate types, which various XML \
libraries can share. Instead of having equivalent-but-incompatible types for \
every binding, parser, or client, they all share the same types can can thus \
interoperate easily. \
 \
This library contains complete types for most parts of an XML document, \
including the prologue, node tree, and doctype. Some basic combinators are \
included for common tasks, including traversing the node tree and filtering \
children."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-0.3.8-4.3.aarch64.rpm"
RPM_HASH = "ada3a1ae36dd26cec95d585f8d671677b35968dcc125fc8cb75241227f280d4d3f4a41f1844031f197bba0e1869df85fc740bb92088ab967738d30507539d4a5"

RPROVIDES:${PN} += "ghc-xml-types \
libHSxml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
