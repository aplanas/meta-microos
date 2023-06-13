SUMMARY = "RFC 4648-compliant Base16 encodings for ByteStrings"
DESCRIPTION = "This package provides support for encoding and decoding binary data according \
to 'base16' (see also <https://tools.ietf.org/html/rfc4648 RFC 4648>) for \
strict (see 'Data.ByteString.Base16') and lazy 'ByteString's (see \
'Data.ByteString.Base16.Lazy'). \
 \
See the <https://hackage.haskell.org/package/base16 base16> package which \
provides superior encoding and decoding performance as well as support for \
lazy, short, and strict variants of 'Text' and 'ByteString' values. \
Additionally, see the <https://hackage.haskell.org/package/base-encoding \
base-encoding> package which provides an uniform API providing conversion paths \
between more binary and textual types."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-1.0.2.0-2.2.aarch64.rpm"
RPM_HASH = "eac2f64383982f43595cb55fce1abfffcbae8930598f09deb19a84946f19234db14610cfa777432e87940e78122ce976bbe5f4968d826b3d775ab1a4d750cb32"

RPROVIDES:${PN} += "ghc-base16-bytestring \
ghc-base16-bytestring(aarch-64) \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
