SUMMARY = "Fast base64 encoding and decoding for ByteStrings"
DESCRIPTION = "This package provides support for encoding and decoding binary data according \
to 'base64' (see also <https://tools.ietf.org/html/rfc4648 RFC 4648>) for \
strict and lazy ByteStrings \
 \
For a fuller-featured and better-performing Base64 library, see the \
<https://hackage.haskell.org/package/base64 base64> package."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-1.2.1.0-2.3.aarch64.rpm"
RPM_HASH = "516b135bac2b77a2fb75480d35681f9a59ea51e948d83883af4997d7fe8ee05ab6def5e536f63fe46b09b426c08e1eabe5c1b1fb7198438cd9a087b2543f1fbb"

RPROVIDES:${PN} += "ghc-base64-bytestring ghc-base64-bytestring(aarch-64) libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
