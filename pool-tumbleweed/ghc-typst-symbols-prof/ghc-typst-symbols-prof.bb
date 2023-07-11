SUMMARY = "Haskell typst-symbols profiling library"
DESCRIPTION = "This package provides the Haskell typst-symbols profiling library."
LICENSE = "MIT"

PV = "0.1.0.1"

RPM_NAME = "ghc-typst-symbols-prof-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "b85d8b7d2cb651fe1cfff9b602e95cd5a32f623cbc55c97f738ee03b31c42feac1b05ba7448a92b81ca947b10898721c4a9f551e94a74ca265127d3fbc82d689"

RPROVIDES:${PN} += "ghc-prof-typst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u \
ghc-typst-symbols-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-text-2.0.2 \
ghc-typst-symbols-devel"

inherit rpm
