SUMMARY = "Haskell network-uri profiling library"
DESCRIPTION = "This package provides the Haskell network-uri profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-prof-2.6.4.2-2.8.aarch64.rpm"
RPM_HASH = "177439b845b828184c124948bbf0f3c7e381102fe69c6b41609f496ee753ad945b8b04e68d6489314a9c200e99a2370469327eb4b5f5fc171101938ee709d253"

RPROVIDES:${PN} += "ghc-network-uri-prof \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM"

RDEPENDS:${PN} += "ghc-network-uri-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS"

inherit rpm
