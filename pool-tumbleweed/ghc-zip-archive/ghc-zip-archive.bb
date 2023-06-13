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

RPM_NAME = "ghc-zip-archive-0.4.3-1.2.aarch64.rpm"
RPM_HASH = "7d069ff031b5a720ca3d0ec48b5589037ee93f80be4027be703c320147f8abb8627a9e54f1da06213895cff44ef42ef8a824f8c6484c7e8bf00a23a7de96256b"

RPROVIDES:${PN} += "ghc-zip-archive \
ghc-zip-archive(aarch-64) \
libHSzip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdigest-0.0.1.7-CCCN8814sFy3HuiyT8t94G-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
