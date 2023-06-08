SUMMARY = "Haskell indexed-traversable profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-prof-0.1.2.1-1.2.aarch64.rpm"
RPM_HASH = "b870f93e7b41bb15b0767c73a4b0258acc72164dbac7dd675a50657f1945a072bf3458ef647bcc3f2f5563212064e065725940daa47cbf14ee0c77387fb9c89c"

RPROVIDES:${PN} += "ghc-indexed-traversable-prof ghc-indexed-traversable-prof(aarch-64) ghc-prof(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs)"
RDEPENDS:${PN} += "ghc-indexed-traversable-devel ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(transformers-0.5.6.2)"

inherit rpm
