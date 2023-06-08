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

RPM_NAME = "ghc-cmdargs-0.10.22-1.3.aarch64.rpm"
RPM_HASH = "d86dd20844583cb0e8dd9d920964eb818c9b1ce1652a7b6d270478818223f1f8c83dd890e29d8f43908644f50f00f1bf4d9becd04cd0bea9b3a9ad2df0369bff"

RPROVIDES:${PN} += "ghc-cmdargs ghc-cmdargs(aarch-64) libHScmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
