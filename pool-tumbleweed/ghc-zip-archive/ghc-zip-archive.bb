SUMMARY = "Library for creating and modifying zip archives"
DESCRIPTION = "The zip-archive library provides functions for creating, modifying, and \
extracting files from zip archives. The zip archive format is documented in \
<http://www.pkware.com/documents/casestudies/APPNOTE.TXT>. \
 \
Certain simplifying assumptions are made about the zip archives: in particular, \
there is no support for strong encryption, zip files that span multiple disks, \
ZIP64, OS-specific file attributes, or compression methods other than Deflate. \
However, the library should be able to read the most common zip archives, and \
the archives it produces should be readable by all standard unzip programs. \
 \
Archives are built and extracted in memory, so manipulating large zip files \
will consume a lot of memory. If you work with large zip files or need features \
not supported by this library, a better choice may be \
<http://hackage.haskell.org/package/zip zip>, which uses a memory-efficient \
streaming approach. However, zip can only read and write archives inside \
instances of MonadIO, so zip-archive is a better choice if you want to \
manipulate zip archives in 'pure' contexts. \
 \
As an example of the use of the library, a standalone zip archiver and \
extracter is provided in the source distribution."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "b025022288c367dfbe7d8d2702cec435cc80da5135730b2c20c285a8dfc141f15a2f71b3fac6e44715ac79a1846a0919eadf132ac5d1197526750ca4924dde14"

RPROVIDES:${PN} += "ghc-zip-archive \
libHSzip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdigest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
