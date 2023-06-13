SUMMARY = "A binding to the X11 graphics library"
DESCRIPTION = "A Haskell binding to the X11 graphics library. The binding is a direct \
translation of the C binding; for documentation of these calls, refer to 'The \
Xlib Programming Manual', available online at <http://tronche.com/gui/x/xlib/>."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-1.10.3-2.3.aarch64.rpm"
RPM_HASH = "1b184a04ab7c248002ad2ae05dc85c068715f393fa92106ea60514486369c17429663cb00da0ee682ad9f4d98cf6d5088ea10aa5247cb30a5dbdf17288d855cc"

RPROVIDES:${PN} += "ghc-X11 \
ghc-X11(aarch-64) \
libHSX11-1.10.3-5dCbs7YG84pBbMQ87MYXiX-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXss.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
