SUMMARY = "CORS for WAI"
DESCRIPTION = "This package provides an implemenation of Cross-Origin resource sharing (CORS) \
for <http://hackage.haskell.org/package/wai Wai> that aims to be compliant with \
<http://www.w3.org/TR/cors>."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-0.2.7-1.5.aarch64.rpm"
RPM_HASH = "f8bee2a7ad358c2036099f940d710bd53610bdd63f39699b86bf008e19e4f27ab7774483dd7897faf2fb498085cd3ad074cc3ca79c454f9d11709aa0e0ff8007"

RPROVIDES:${PN} += "ghc-wai-cors \
libHSwai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-unicode-symbols-0.2.4.2-AsBlETXXS2UHsp6FZL7O0P-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvault-0.3.1.5-JTstBlaocLP2eokwHW0Uig-ghc9.4.6.so \
libHSwai-3.2.3-JhFX1996sswH7nU4MZQSow-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
