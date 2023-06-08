SUMMARY = "Bindings to the Xft and some Xrender parts"
DESCRIPTION = "A Haskell bindings to the X Font library. With it, Haskell X11 applications can \
access high quality font renderings and provide fonts with anti-aliasing and \
subpixel rendering. The bindings also provide minimal bindings to Xrender \
parts."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-0.3.4-2.2.aarch64.rpm"
RPM_HASH = "39d6e609a1113de041fadc5362b865ab02a8ae6bdb3f4bcc00c793f80d71b1e3fc33edb3cb13c5a93a1c783d9f8f9ec476df90c311b6332a00bf387aa898a751"

RPROVIDES:${PN} += "ghc-X11-xft ghc-X11-xft(aarch-64) libHSX11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSX11-1.10.3-5dCbs7YG84pBbMQ87MYXiX-ghc9.4.5.so()(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXss.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
