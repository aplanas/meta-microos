SUMMARY = "Haskell terminfo profiling library"
DESCRIPTION = "This package provides the Haskell terminfo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-prof-0.4.1.5-3.2.aarch64.rpm"
RPM_HASH = "71dc8b39cde11c607b7eefaa4d8c20ea87f39fb2206c951c6f27fa1f7fdaee80092aaeac1d3445e7559a5536ceebcd12bc23720232be7779986e21874d9a718a"

RPROVIDES:${PN} += "ghc-prof-terminfo-0.4.1.5 \
ghc-terminfo-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-terminfo-devel"

inherit rpm
