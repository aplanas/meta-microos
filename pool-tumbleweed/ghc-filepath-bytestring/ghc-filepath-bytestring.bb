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

RPM_NAME = "ghc-filepath-bytestring-1.4.2.1.13-1.3.aarch64.rpm"
RPM_HASH = "fe98b87a44e646648e3812c82708e785cd064e6df2d640a9bb0a301eea8e33fc507de307a8f5104bd86d8eef8e5f71b908c087e67e5d8d0f301366f360938281"

RPROVIDES:${PN} += "ghc-filepath-bytestring \
libHSfilepath-bytestring-1.4.2.1.13-1FmfoCrfLITG59KaBERpzO-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
