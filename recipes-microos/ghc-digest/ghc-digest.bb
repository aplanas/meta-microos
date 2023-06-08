SUMMARY = "Various hashes for bytestrings; CRC32 and Adler32 for now"
DESCRIPTION = "This package provides efficient hash implementations for strict and lazy \
bytestrings. For now, CRC32 and Adler32 are supported; they are implemented as \
FFI bindings to efficient code from zlib."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-0.0.1.7-1.3.aarch64.rpm"
RPM_HASH = "0a7e3e2b5765c3281b74ae7c6463032c9694b37cd12a5c412dc987ac603b5256dcacdeedcb83ee0bc860106f7b76ff46e57a23198aeeb36a32e0ab2ecd89039e"

RPROVIDES:${PN} += "ghc-digest ghc-digest(aarch-64) libHSdigest-0.0.1.7-CCCN8814sFy3HuiyT8t94G-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
