SUMMARY = "Command line argument processing"
DESCRIPTION = "This library provides an easy way to define command line parsers. Most users \
will want to use the 'System.Console.CmdArgs.Implicit' module, whose \
documentation contains an example. \
 \
* 'System.Console.CmdArgs.Explicit' provides a way to write command line \
parsers for both single mode programs (most programs) and multiple mode \
programs (e.g. darcs or cabal). Parsers are defined by constructing a data \
structure. \
 \
* 'System.Console.CmdArgs.Implicit' provides a way to concisely define command \
line parsers, up to three times shorter than getopt. These parsers are \
translated into the Explicit data type. \
 \
* 'System.Console.CmdArgs.GetOpt' provides a wrapper allowing compatiblity with \
existing getopt parsers, mapping to the Explicit data type. \
 \
For a general reference on what command line flags are commonly used, see \
<http://www.faqs.org/docs/artu/ch10s05.html>."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-0.10.22-1.8.aarch64.rpm"
RPM_HASH = "6aa98fd2abc3c6a89b76a054f6dfbc792f332d1e0bb9479b34041df7bfcbc1cce0e6146467edecd14be4b9cea7caf8998de0fd483e7f23144913c59ec3966f36"

RPROVIDES:${PN} += "ghc-cmdargs \
libHScmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx-ghc9.4.6.so"

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
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
