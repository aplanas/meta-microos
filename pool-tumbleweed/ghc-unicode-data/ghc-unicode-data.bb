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

RPM_NAME = "ghc-unicode-data-0.4.0.1-3.6.aarch64.rpm"
RPM_HASH = "45e4f57bbe2aead1cf75b1e5cac12d37837c7e03dd1c2a80047c8ea3bf8412d79cd7b82630f20cd80ad20035bddf7130772c2976473110f3ad5d3858ebc740ef"

RPROVIDES:${PN} += "ghc-unicode-data \
libHSunicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
