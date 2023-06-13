SUMMARY = "Haskell bimap library development files"
DESCRIPTION = "This package provides the Haskell bimap library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-devel-0.5.0-2.2.aarch64.rpm"
RPM_HASH = "871b40a3d87dc38186a8823029ec3dc6881aa789c379e50a12bd025b5eaac5b3e5c9bb1b0c1da5fcdaa860ddc3edda906d110bc111c542dd35ab820c6b55f12d"

RPROVIDES:${PN} += "ghc-bimap-devel \
ghc-bimap-devel(aarch-64) \
ghc-devel(bimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE)"

RDEPENDS:${PN} += "/bin/sh \
ghc-bimap \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(exceptions-0.10.5)"

inherit rpm
