SUMMARY = "Windows code page library for Haskell"
DESCRIPTION = "This library provides two modules: \
 \
* 'System.IO.CodePage': a cross-platform module that exports functions which \
adjust code pages on Windows, and do nothing on other operating systems. \
 \
* 'System.Win32.CodePage': On Windows, this exports functions for getting, \
setting, and analyzing code pages. On other operating systems, this module \
exports nothing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-0.2.1-2.7.aarch64.rpm"
RPM_HASH = "56bd08f8b186c51db264d0717842f663b1f38b0154cdfecd4032fecf631a7b2d5b49094a47c57182ed738dc862fb5e75d405f27da1f5f526a12734434bd7ad94"

RPROVIDES:${PN} += "ghc-code-page \
libHScode-page-0.2.1-FtqibIt49dG4EHKj0zD5sM-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
