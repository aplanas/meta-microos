SUMMARY = "Simple multicast library"
DESCRIPTION = "The 'Network.Multicast' module is for sending UDP datagrams over multicast \
(class D) addresses."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-0.3.2-4.3.aarch64.rpm"
RPM_HASH = "466e3e4c2ef6031b0ca0c7e94a9f375f4eb89bbc9f6c2b4be86586f03492cbcbb132f6be30ffdc133f6fda275127be8d45681cd36544a4acf77476581e24ac38"

RPROVIDES:${PN} += "ghc-network-multicast \
libHSnetwork-multicast-0.3.2-4WWinAJ7bwBLL5fL2eaYym-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSnetwork-bsd-2.8.1.0-K9geVudEUPh9zpSal1iibE-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
