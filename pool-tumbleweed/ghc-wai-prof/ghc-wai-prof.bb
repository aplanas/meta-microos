SUMMARY = "Haskell wai profiling library"
DESCRIPTION = "This package provides the Haskell wai profiling library."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-prof-3.2.3-2.5.aarch64.rpm"
RPM_HASH = "d0b57d88eccd8cfbbed9c58745a8884f550c00d51eed81460ee3104448c4ec11eb468cc7589d0b190a2b2af80906f458cf18f1760db888e023e4808dcf466a0b"

RPROVIDES:${PN} += "ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-wai-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-text-2.0.2 \
ghc-prof-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-wai-devel"

inherit rpm
