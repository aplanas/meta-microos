SUMMARY = "Run external processes, with strong typing of streams"
DESCRIPTION = "Please see the tutorial at <https://github.com/fpco/typed-process#readme>."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-0.2.11.0-1.3.aarch64.rpm"
RPM_HASH = "5469ebc8a80023195ba1adf5e49f1fd0124ad561fcc5b2f7a82a4a19e2ca2d1285e59b71abc318e7c559876e954bb41e1e1e52d9dd431b7f217ed8cbb0547867"

RPROVIDES:${PN} += "ghc-typed-process \
ghc-typed-process(aarch-64) \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
