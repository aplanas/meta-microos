SUMMARY = "A cross-platform, cross-console way to handle echoing terminal input"
DESCRIPTION = "The 'base' library exposes the 'hGetEcho' and 'hSetEcho' functions for querying \
and setting echo status, but unfortunately, neither function works with MinTTY \
consoles on Windows. This is a serious issue, since 'hGetEcho' and 'hSetEcho' \
are often used to disable input echoing when a program prompts for a password, \
so many programs will reveal your password as you type it on MinTTY! \
 \
This library provides an alternative interface which works with both MinTTY and \
other consoles. An example is included which demonstrates how one might prompt \
for a password using this library. To build it, make sure to configure with the \
'-fexample' flag."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-0.1.4-2.2.aarch64.rpm"
RPM_HASH = "89877d096d1ca7cd0dde794537d84bd6781a58da0e6f8b6ab019446c19eb673c80bbd82f90be6d3d3e1acd38f6e8f83b0ab6dfffd02c40a12f9dea57b9d1ee06"

RPROVIDES:${PN} += "ghc-echo \
ghc-echo(aarch-64) \
libHSecho-0.1.4-GGh6ZLKme4z6jywDiYhFOL-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
