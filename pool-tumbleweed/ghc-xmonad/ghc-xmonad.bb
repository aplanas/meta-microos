SUMMARY = "Haskell xmonad library"
DESCRIPTION = "This package provides the Haskell xmonad shared library."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-0.17.2-1.8.aarch64.rpm"
RPM_HASH = "9223ae9336d0b08d4bf6bb38c28ae93ba601cf710f70e4be3d40d4fc718aa3ae1c1eeaa862eb87787bc73791453e0557ce2866bfae2858238de874c0c74bb71a"

RPROVIDES:${PN} += "ghc-xmonad \
libHSxmonad-0.17.2-5u18H8h5WrJ4e8esV9nzjE-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSsetlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
