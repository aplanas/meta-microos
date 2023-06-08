SUMMARY = "Conversion between emoji characters and their names"
DESCRIPTION = "This package provides functions for converting emoji names to emoji characters \
and vice versa. \
 \
How does it differ from the 'emoji' package? \
 \
- It supports a fuller range of emojis, including all those supported by GitHub \
- It supports lookup of emoji aliases from emoji - It uses Text rather than \
String - It has a lighter dependency footprint: in particular, it does not \
require aeson - It does not require TemplateHaskell."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-emojis-0.1.2-2.2.aarch64.rpm"
RPM_HASH = "977a9abb699fcd1b6b5435007d16f518daae4a05662b15b0703b7f394b08cb29340f50648e8b2f8e1b45ff0890558110d875381053d0203c9467605d84a896e2"

RPROVIDES:${PN} += "ghc-emojis ghc-emojis(aarch-64) libHSemojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
