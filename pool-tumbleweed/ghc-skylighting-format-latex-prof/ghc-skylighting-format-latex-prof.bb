SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.6.aarch64.rpm"
RPM_HASH = "568cc93f7dee2a415aba684e6fa4a11d9e96e1eee32579df58dc44fd8780a452a16f67e4667a64c664c172ab537446d9ec6a66a752dd000cbca2efeea800f985"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-latex-0.1-J2O8wjQxddL48jSKv998Ye \
ghc-skylighting-format-latex-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-latex-devel"

inherit rpm
