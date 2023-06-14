SUMMARY = "A binding to the X11 graphics library"
DESCRIPTION = "A Haskell binding to the X11 graphics library. The binding is a direct \
translation of the C binding; for documentation of these calls, refer to 'The \
Xlib Programming Manual', available online at <http://tronche.com/gui/x/xlib/>."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-1.10.3-2.3.aarch64.rpm"
RPM_HASH = "1b184a04ab7c248002ad2ae05dc85c068715f393fa92106ea60514486369c17429663cb00da0ee682ad9f4d98cf6d5088ea10aa5247cb30a5dbdf17288d855cc"

RPROVIDES:${PN} += "ghc-X11 \
libHSX11-1.10.3-5dCbs7YG84pBbMQ87MYXiX-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
