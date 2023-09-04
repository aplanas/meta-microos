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

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-1.4.2.1.13-1.5.aarch64.rpm"
RPM_HASH = "a3d146695f7da68e5cb1bab8d5cbb14d1a90a37549bee442a8a0a62bb709ada8a3c6505e32ad40475129e7a7e8266518109988e2abd00a0fe56ca4abcbf858d5"

RPROVIDES:${PN} += "ghc-filepath-bytestring \
libHSfilepath-bytestring-1.4.2.1.13-KgttGjs0pYw2aEgCzIFOnB-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
