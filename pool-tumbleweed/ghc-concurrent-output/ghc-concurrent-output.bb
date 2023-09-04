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

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-1.10.18-1.6.aarch64.rpm"
RPM_HASH = "39d7594f3e33c430ef8f593c15221e050cfb001d2a0e196cd303e472ea152761fea1ec03aa0f3957c509019e0776209066ef144410ffe11864c8002dc2839b83"

RPROVIDES:${PN} += "ghc-concurrent-output \
libHSconcurrent-output-1.10.18-7mD57bQUyK62aUS02yxnhe-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSterminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
