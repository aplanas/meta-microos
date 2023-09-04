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

RPM_NAME = "ghc-echo-0.1.4-2.3.aarch64.rpm"
RPM_HASH = "b1c5ed36bf1f45ddbc9b69ff9cfd07195908778c8452f1a9ea66391b44a0f20ce23a5c724a5953fa403fad9fe9ed793e095a0fb5f3234485da6a9a224a071b41"

RPROVIDES:${PN} += "ghc-echo \
libHSecho-0.1.4-E70uPOVrrAEEin21p1eUkX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
