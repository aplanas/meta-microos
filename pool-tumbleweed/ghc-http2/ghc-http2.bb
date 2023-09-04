SUMMARY = "HTTP/2 library"
DESCRIPTION = "HTTP/2 library including frames, priority queues, HPACK, client and server."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-3.0.3-2.14.aarch64.rpm"
RPM_HASH = "d83cf7954a6530ce07e1eeef991e2e1119b6112e7a3b274205f761aff35941c17bb548299420eca5d2aa41e81549422af831fa15023a269f91065e1e9d250e7a"

RPROVIDES:${PN} += "ghc-http2 \
libHShttp2-3.0.3-41eYSHbDrcoAjUXjlws3pm-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSauto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSold-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSpsqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C-ghc9.4.6.so \
libHSsafe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStime-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunix-time-0.4.10-fuTENic3zHIuWAM5F0fYB-ghc9.4.6.so \
libHSunliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
