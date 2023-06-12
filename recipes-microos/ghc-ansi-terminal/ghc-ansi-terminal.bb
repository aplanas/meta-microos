SUMMARY = "Simple ANSI terminal support, with Windows compatibility"
DESCRIPTION = "ANSI terminal support for Haskell: allows cursor movement, screen clearing, \
color output, showing or hiding the cursor, and changing the title. \
Works on UNIX and Windows."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-0.11.5-1.2.aarch64.rpm"
RPM_HASH = "a8c3234a0d7acf19ada0c7ee4dc7c2fa5cf42a3d39b22db7e8dc5b4e0de74626c89d3d699ff5c9c273a1210e7deab601ca5f2050550d0b5656aebf87033bf766"

RPROVIDES:${PN} += "ghc-ansi-terminal \
ghc-ansi-terminal(aarch-64) \
libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
