SUMMARY = "Privacy Enhanced Mail (PEM) format reader and writer"
DESCRIPTION = "Privacy Enhanced Mail (PEM) format reader and writer."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-0.2.4-8.8.aarch64.rpm"
RPM_HASH = "8a49dcb48f8f08e7efc9f1a2c63dbc018d7aa107c611be01a6000f7ca524396a343ea71037a8472c69ad214cb60976354306db9bc4d1bcab38f1ef230e8f295c"

RPROVIDES:${PN} += "ghc-pem \
libHSpem-0.2.4-F5Ih0vrB4sf5XALvrxfus2-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
