SUMMARY = "Socks proxy (ver 5)"
DESCRIPTION = "Socks proxy (version 5) implementation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-0.6.1-6.3.aarch64.rpm"
RPM_HASH = "f8c10b0c3113200caa6df2d0a86fe6423c0493661150525042ae2a2a303377fe9c31512cf7cf81bd379d2a0cbd2b45b1402d78c183f7e18863e81f40e233fbb3"

RPROVIDES:${PN} += "ghc-socks ghc-socks(aarch-64) libHSsocks-0.6.1-CAd82jbrmKj2bUx8fkWhGg-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
