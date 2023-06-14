SUMMARY = "Ungarble output from several threads or commands"
DESCRIPTION = "Lets multiple threads and external processes concurrently output to the \
console, without it getting all garbled up. \
 \
Built on top of that is a way of defining multiple output regions, which are \
automatically laid out on the screen and can be individually updated by \
concurrent threads. Can be used for progress displays etc. \
 \
<<https://joeyh.name/code/concurrent-output/demo2.gif>>."
LICENSE = "BSD-2-Clause"

PV = "1.10.17"

RPM_NAME = "ghc-concurrent-output-1.10.17-2.3.aarch64.rpm"
RPM_HASH = "6695f5b2f17acfa78d48959e4449bc7fc39337865d7d0f6df4d3906f12f784d3bbff45e629410696a1c4376c6eb61d340c0442d93e91393dddda90557a8d5fb6"

RPROVIDES:${PN} += "ghc-concurrent-output \
libHSconcurrent-output-1.10.17-8XvoUl0e7ll2y9NMBdkV0e-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHSterminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
