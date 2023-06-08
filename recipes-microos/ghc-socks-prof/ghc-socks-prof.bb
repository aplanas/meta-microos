SUMMARY = "Haskell socks profiling library"
DESCRIPTION = "This package provides the Haskell socks profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-prof-0.6.1-6.3.aarch64.rpm"
RPM_HASH = "5c9f208189458d51b4311636c30d487f851b49defb78f7c777e55b23bea7fed4571a173438096e8b46e6403dda5c5e2865c855210f6c63be163a13f61e87ca6e"

RPROVIDES:${PN} += "ghc-prof(socks-0.6.1-CAd82jbrmKj2bUx8fkWhGg) ghc-socks-prof ghc-socks-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) ghc-prof(bytestring-0.11.4.0) ghc-prof(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-socks-devel"

inherit rpm
