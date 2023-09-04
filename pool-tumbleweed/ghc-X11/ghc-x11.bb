SUMMARY = "A binding to the X11 graphics library"
DESCRIPTION = "A Haskell binding to the X11 graphics library. The binding is a direct \
translation of the C binding; for documentation of these calls, refer to 'The \
Xlib Programming Manual', available online at <http://tronche.com/gui/x/xlib/>."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-1.10.3-2.8.aarch64.rpm"
RPM_HASH = "73337cb1d6a679e10034b17883537a19dbb72e4f944e4510f868756020405ba20d9412049a776ba5ed6cc8e1c12bf33ab7a1ba417719bfbbedd72759e10b1d3b"

RPROVIDES:${PN} += "ghc-X11 \
libHSX11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
