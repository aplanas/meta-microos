SUMMARY = "Haskell socks library development files"
DESCRIPTION = "This package provides the Haskell socks library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-devel-0.6.1-6.3.aarch64.rpm"
RPM_HASH = "2aeda594e7f43feed667de103d097cef129bb038a978e22a123f2ead8dea4a88116c5d3d49ee6e360a52ca8e1033119e25ad6691f3dff3664f3e6da66eb03b24"

RPROVIDES:${PN} += "ghc-devel(socks-0.6.1-CAd82jbrmKj2bUx8fkWhGg) ghc-socks-devel ghc-socks-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) ghc-devel(bytestring-0.11.4.0) ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-socks"

inherit rpm
