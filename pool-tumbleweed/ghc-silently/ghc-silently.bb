SUMMARY = "Prevent or capture writing to stdout and other handles"
DESCRIPTION = "Prevent or capture writing to stdout, stderr, and other handles."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-1.2.5.3-2.3.aarch64.rpm"
RPM_HASH = "96b7fe236ced87e499f4648a556f47a8226e966529a1787fbe3d121d3489cae3b354e5cf6b5cd39bfda636802fbfcf75d3a092bdb29eee3ff85052c4b5371456"

RPROVIDES:${PN} += "ghc-silently \
libHSsilently-1.2.5.3-DooEMl8ysOU4ZpgKypCRy8-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
