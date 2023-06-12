SUMMARY = "Web Application Interface"
DESCRIPTION = "Provides a common protocol for communication between web applications and web \
servers. \
 \
API docs and the README are available at <http://www.stackage.org/package/wai>."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-3.2.3-2.2.aarch64.rpm"
RPM_HASH = "1763b3a338cdd3faa06bccb8c0106876010030b934303a595f4a6e10902f2e7047cd225e8eb8f484fd8f7d047861bf2354d2f5d6ea0fe36f2b66c9320cb27fd6"

RPROVIDES:${PN} += "ghc-wai \
ghc-wai(aarch-64) \
libHSwai-3.2.3-LsLg4DRwusRI7b3SRdjDzn-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSvault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
