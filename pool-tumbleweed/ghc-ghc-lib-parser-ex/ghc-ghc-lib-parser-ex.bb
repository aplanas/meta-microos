SUMMARY = "Algorithms on GHC parse trees"
DESCRIPTION = "Algorithms on GHC parse trees."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-9.4.0.0-1.3.aarch64.rpm"
RPM_HASH = "fb0601adf25a1dcfff1162752f70b75c0635fd1162bfdc92c7b0ddd9737cc261758e7f163d69a11cb525acef94d8a247709a630ea6038a877e0757937f6b669f"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex \
libHSghc-lib-parser-ex-9.4.0.0-70SEjDlvh6sIQjB4r4CbU7-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSuniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
