SUMMARY = "HTTP/2 library"
DESCRIPTION = "HTTP/2 library including frames, priority queues, HPACK, client and server."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-3.0.3-2.10.aarch64.rpm"
RPM_HASH = "100060a3a6c8f1fb84a86117d04c0e21f1b389c8d4e46105fca67e45cef61a5c889d44864fbead24cabfc51321339293b2b4fc8eb50dcafe2e9c58abc8cd5475"

RPROVIDES:${PN} += "ghc-http2 \
libHShttp2-3.0.3-C8jMo1PWq0Httjut7cZnE-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSnetwork-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSpsqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-manager-0.0.0-49hD2RcPrUEG8anOiBePCj-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
