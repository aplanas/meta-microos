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

RPM_NAME = "ghc-tar-0.5.1.1-11.8.aarch64.rpm"
RPM_HASH = "b7358670931a8eef1ed892474b81c3e535a916145a6f466cc4bf266146dcc67155f1acc09396fc1748fa0dab5a90f0bf6f0be1e9be70dd7539f7ab21d6bb4d23"

RPROVIDES:${PN} += "ghc-tar \
libHStar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
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
