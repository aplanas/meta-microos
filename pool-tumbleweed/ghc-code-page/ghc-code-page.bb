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

RPM_NAME = "ghc-code-page-0.2.1-2.5.aarch64.rpm"
RPM_HASH = "46bf1321f10c28ce9f34c15a7bf5d82247cdec64902c28c14816b4d19f306cd4b4f9dac5803002da3025e34e13e3c5acddfd25ad37871a2f048fdf83de34b508"

RPROVIDES:${PN} += "ghc-code-page \
libHScode-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
