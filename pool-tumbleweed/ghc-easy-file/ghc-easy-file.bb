SUMMARY = "Cross-platform File handling"
DESCRIPTION = "Cross-platform File handling for Unix/Mac/Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-0.2.5-1.5.aarch64.rpm"
RPM_HASH = "942e81f4c546637535c5f8456d74f8016e6e6908558667c3615af88220abd6081e88d02d21c72784b7f588fa8d73ceee3a57e844b45bdc3af5d3d80881b06733"

RPROVIDES:${PN} += "ghc-easy-file \
libHSeasy-file-0.2.5-IptebCGkAyyEfjLBFFjLI-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
