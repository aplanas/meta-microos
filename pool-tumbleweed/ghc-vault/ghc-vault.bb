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

RPM_NAME = "ghc-vault-0.3.1.5-4.3.aarch64.rpm"
RPM_HASH = "13e6946d3c42c3998eaab6a10b9bd0ef0b8469bf4e8e3f6b581ec014272c263e4e077b8756d45a35efc731a4a53ca254a8726ba7b0294ac9f52d11d3857c15d5"

RPROVIDES:${PN} += "ghc-vault \
ghc-vault(aarch-64) \
libHSvault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
