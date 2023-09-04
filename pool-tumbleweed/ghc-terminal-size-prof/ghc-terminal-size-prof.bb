SUMMARY = "Haskell terminal-size profiling library"
DESCRIPTION = "This package provides the Haskell terminal-size profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-prof-0.3.4-1.4.aarch64.rpm"
RPM_HASH = "f5e4aa56fb84145a7167446b91ccef4a166bcb18ca040c9037a99f81c6c614e6b16a3f5bf8b2b0b9bc313244dccb5e0e4e575fe36d950299037857138e5abfd3"

RPROVIDES:${PN} += "ghc-prof-terminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8 \
ghc-terminal-size-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-terminal-size-devel"

inherit rpm
