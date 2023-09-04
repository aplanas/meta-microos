SUMMARY = "Web Application Interface"
DESCRIPTION = "Provides a common protocol for communication between web applications and web \
servers. \
 \
API docs and the README are available at <http://www.stackage.org/package/wai>."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-3.2.3-2.5.aarch64.rpm"
RPM_HASH = "20dbb1464679b34459b20ae7cc9eb00e08c7b98ea784aa251f4f7088b71488d0e25eb65abe61b438c55eb21feeb8b85f067e64ddae74ce074d4582ff7d30926c"

RPROVIDES:${PN} += "ghc-wai \
libHSwai-3.2.3-JhFX1996sswH7nU4MZQSow-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
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
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvault-0.3.1.5-JTstBlaocLP2eokwHW0Uig-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
