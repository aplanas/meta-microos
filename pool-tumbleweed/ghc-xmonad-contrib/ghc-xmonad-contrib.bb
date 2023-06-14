SUMMARY = "Community-maintained extensions for xmonad"
DESCRIPTION = "Community-maintained tiling algorithms and extension modules for xmonad, an X11 \
tiling window manager. \
 \
For an introduction to building, configuring and using xmonad extensions, see \
'XMonad.Doc'. In particular: \
 \
'XMonad.Doc.Configuring', a guide to configuring xmonad \
 \
'XMonad.Doc.Extending', using the contributed extensions library \
 \
'XMonad.Doc.Developing', introduction to xmonad internals and writing your own \
extensions."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-0.17.1-3.4.aarch64.rpm"
RPM_HASH = "6d5f18a3b130b59e98965e8878882fce54407f39992314085f8dca9f0f9ded0673dbab0ea4d84dc62845a29726ce85c2d760f1395c765aad5b53f5b28e35338a"

RPROVIDES:${PN} += "ghc-xmonad-contrib \
libHSxmonad-contrib-0.17.1-4q9MntM3g8MH8PR7JoUT1u-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-5dCbs7YG84pBbMQ87MYXiX-ghc9.4.5.so \
libHSX11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq-ghc9.4.5.so \
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
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsetlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libHSxmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I-ghc9.4.5.so \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
