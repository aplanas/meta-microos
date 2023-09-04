SUMMARY = "Bindings to the Xft and some Xrender parts"
DESCRIPTION = "A Haskell bindings to the X Font library. With it, Haskell X11 applications can \
access high quality font renderings and provide fonts with anti-aliasing and \
subpixel rendering. The bindings also provide minimal bindings to Xrender \
parts."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-0.3.4-2.3.aarch64.rpm"
RPM_HASH = "41b16b63f5f02736a2b5fab1237b75f465828d2c101979cb4e174076a812f7509d12cccd8ad8131ec34de2ad912a71d66e0853b91bf4b6f8c86230743baa925f"

RPROVIDES:${PN} += "ghc-X11-xft \
libHSX11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSX11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
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
