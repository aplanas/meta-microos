SUMMARY = "Haskell typst-symbols profiling library"
DESCRIPTION = "This package provides the Haskell typst-symbols profiling library."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-prof-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "31de9e206da3e988d27c9a3343cec6366c778200065ce419e9800a5c8fee015bb65ff9c0e361b2a67093b93344fdb339e1211ac9a1be991578ef2af0b0b4a8db"

RPROVIDES:${PN} += "ghc-prof-typst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB \
ghc-typst-symbols-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-text-2.0.2 \
ghc-typst-symbols-devel"

inherit rpm
