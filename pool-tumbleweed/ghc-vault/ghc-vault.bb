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

RPM_NAME = "ghc-vault-0.3.1.5-4.9.aarch64.rpm"
RPM_HASH = "859417baf862a27921b8a23ff3845f14c6a56d1b28df89e7f7b35ff8e32d92634a046acfc9f82bc8a82b3cb160a7002bb4b3bb2efc2d0eb5069d13618ddf0462"

RPROVIDES:${PN} += "ghc-vault \
libHSvault-0.3.1.5-JTstBlaocLP2eokwHW0Uig-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
