SUMMARY = "Haskell HUnit profiling library"
DESCRIPTION = "This package provides the Haskell HUnit profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-prof-1.6.2.0-2.3.aarch64.rpm"
RPM_HASH = "909681ff60a2eb0abc21b777f2eda7f92e8d13f80bdc9080e97fc728506a603ac20c4cc823058e001cc0eae9828c134ab925b788c31ad2a30b77d400ba9d421a"

RPROVIDES:${PN} += "ghc-HUnit-prof \
ghc-HUnit-prof(aarch-64) \
ghc-prof(HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb)"

RDEPENDS:${PN} += "ghc-HUnit-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk) \
ghc-prof(deepseq-1.4.8.0)"

inherit rpm
