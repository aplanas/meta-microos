SUMMARY = "Reading, writing and manipulating '.tar' archive files"
DESCRIPTION = "This library is for working with ''.tar'' archive files. It can read and write \
a range of common variations of archive format including V7, POSIX USTAR and \
GNU formats. \
 \
It provides support for packing and unpacking portable archives. This makes it \
suitable for distribution but not backup because details like file ownership \
and exact permissions are not preserved. \
 \
It also provides features for random access to archive content using an index."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-0.5.1.1-11.3.aarch64.rpm"
RPM_HASH = "2ee59c6ec047b48a5d01dc5bc97597f202de8935088900b0a517358c336f67df24c539e236a2af34cd765b962d80a922833c07dd9ad30a7c195510d15f9e33cb"

RPROVIDES:${PN} += "ghc-tar \
ghc-tar(aarch-64) \
libHStar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
