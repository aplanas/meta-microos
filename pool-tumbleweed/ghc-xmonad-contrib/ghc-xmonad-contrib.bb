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

RPM_NAME = "ghc-xmonad-contrib-0.17.1-3.9.aarch64.rpm"
RPM_HASH = "58c92561c9158401e71a7a058f2dc3688e6112054b021afcd17a573286d6be00389183a74a367cfc37ce75bb91c64ba4e886dd8b006d33e05d61dda389546157"

RPROVIDES:${PN} += "ghc-xmonad-contrib \
libHSxmonad-contrib-0.17.1-5rViN1CbGyt6rkBLjPE8fT-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4-ghc9.4.6.so \
libHSX11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS-ghc9.4.6.so \
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
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSsetlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSxmonad-0.17.2-5u18H8h5WrJ4e8esV9nzjE-ghc9.4.6.so \
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
