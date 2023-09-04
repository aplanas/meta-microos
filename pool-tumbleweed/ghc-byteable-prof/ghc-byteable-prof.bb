SUMMARY = "Haskell byteable profiling library"
DESCRIPTION = "This package provides the Haskell byteable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-prof-0.1.1-12.3.aarch64.rpm"
RPM_HASH = "a3f230afc9fa836f51d6f42d24949334c9ef6eabf5091500bdd0acc5bb76b4599637b8bce2b31a43abce54b41bf85ee76fd8be4db0f0d0d3e38c6a48d1995e95"

RPROVIDES:${PN} += "ghc-byteable-prof \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r"

RDEPENDS:${PN} += "ghc-byteable-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
