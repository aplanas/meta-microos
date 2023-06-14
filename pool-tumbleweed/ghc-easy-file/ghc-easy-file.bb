SUMMARY = "Cross-platform File handling"
DESCRIPTION = "Cross-platform File handling for Unix/Mac/Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-easy-file-0.2.3-1.3.aarch64.rpm"
RPM_HASH = "a3e023d42705b3f10be890f7bde85583ecb9e4dfd01217c26010f1330fc224ae92a4be0b621579d1759574b9645ac5c94775d7445790e83fe3c5e7f2c2b92b2e"

RPROVIDES:${PN} += "ghc-easy-file \
libHSeasy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
