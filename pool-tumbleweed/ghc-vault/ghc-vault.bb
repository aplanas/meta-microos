SUMMARY = "A persistent store for values of arbitrary types"
DESCRIPTION = "A /vault/ is a persistent store for values of arbitrary types. It's like having \
first-class access to the storage space behind IORefs. \
 \
The data structure is analogous to a bank vault, where you can access different \
bank boxes with different keys; hence the name. \
 \
Also provided is a /locker/ type, representing a store for a single element."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-0.3.1.5-4.6.aarch64.rpm"
RPM_HASH = "fe6dfb00631811f2e54e3fcc27fb85424648ecd6a99dd23034c60458c47c368abd256e9b99fc3753ca7c02159dcf9b0d4876f24f8e044610652f45e5194362a2"

RPROVIDES:${PN} += "ghc-vault \
libHSvault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
