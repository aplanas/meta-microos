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

RPM_NAME = "ghc-code-page-0.2.1-2.2.aarch64.rpm"
RPM_HASH = "cfb5df1f3f1543e2a51f9006146102716f8a7e244d9a95efb598355d2cc705940b0bbdcb4489d4fe271b7b22e128056ebfda8907894334d6915edf2c8f18704e"

RPROVIDES:${PN} += "ghc-code-page \
libHScode-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
