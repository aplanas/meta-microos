SUMMARY = "Simple multicast library"
DESCRIPTION = "The 'Network.Multicast' module is for sending UDP datagrams over multicast \
(class D) addresses."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-0.3.2-4.4.aarch64.rpm"
RPM_HASH = "c256b42d821d46f7ebed10a350e31e06700b78e16a5c8cf3363e33e275e6b685ce976f3e8e2c83e78399ba122df77e213897887fc32644c0719b210a577908a8"

RPROVIDES:${PN} += "ghc-network-multicast \
libHSnetwork-multicast-0.3.2-49FavpxpKt9CEnvETsCD9h-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
