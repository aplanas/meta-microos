SUMMARY = "Library for manipulating RawFilePaths in a cross platform way"
DESCRIPTION = "This package provides functionality for manipulating 'RawFilePath' values. \
It can be used as a drop in replacement for the filepath library to get the \
benefits of using ByteStrings. It provides three modules: \
 \
* 'System.FilePath.Posix.ByteString' manipulates POSIX/Linux style \
'RawFilePath' values (with '/' as the path separator). \
 \
* 'System.FilePath.Windows.ByteString' manipulates Windows style 'RawFilePath' \
values (with either '\\' or '/' as the path separator, and deals with drives). \
 \
* 'System.FilePath.ByteString' is an alias for the module appropriate to your \
platform. \
 \
All three modules provide the same API, and the same documentation (calling out \
differences in the different variants). \
 \
This package is now deprecated, since filepath 1.4.100.0 provides an OsPath \
type that is based on a bytestring. See \
https://hasufell.github.io/posts/2022-06-29-fixing-haskell-filepaths.html."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.12"

RPM_NAME = "ghc-filepath-bytestring-1.4.2.1.12-1.3.aarch64.rpm"
RPM_HASH = "d719130acb7167a2b9baf97257de8b609134be7f9a656be5e175ce70f74941af02476e401fd7a37898e7b39ad103edee6cdc75c66433a8cb2a49cacc37c5b99f"

RPROVIDES:${PN} += "ghc-filepath-bytestring ghc-filepath-bytestring(aarch-64) libHSfilepath-bytestring-1.4.2.1.12-j7n9rVANDcF3su3QaU7xU-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
