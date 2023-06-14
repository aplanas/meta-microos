SUMMARY = "Haskell xmonad library"
DESCRIPTION = "This package provides the Haskell xmonad shared library."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-0.17.2-1.3.aarch64.rpm"
RPM_HASH = "cdb43123ceb240295853a73bea99af8d10606c4b10a9e2bba236b4209ae926fb997bd8a0cf7c08bd5a743cbcdd7ae8675d3f41488fa8a44b72201b4b1b9e2995"

RPROVIDES:${PN} += "ghc-xmonad \
libHSxmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-5dCbs7YG84pBbMQ87MYXiX-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSsetlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
