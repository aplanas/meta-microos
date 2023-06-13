SUMMARY = "Access Unicode Character Database (UCD)"
DESCRIPTION = "'unicode-data' provides Haskell APIs to efficiently access the \
<https://www.unicode.org/ucd/ Unicode character database> (UCD). \
Performance is the primary goal in the design of this package. \
 \
The Haskell data structures are generated programmatically from the UCD files. \
The latest Unicode version supported by this library is \
'<https://www.unicode.org/versions/Unicode15.0.0/ 15.0.0>'."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-0.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "03beab559699eae189953f558de29d4d4c68927192a27658488d035dcd5352004821173ee5eeac3dbe12d457412650c2e616742710a1c9fd93986376daf2da60"

RPROVIDES:${PN} += "ghc-unicode-data \
ghc-unicode-data(aarch-64) \
libHSunicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
