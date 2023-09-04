SUMMARY = "Haskell filepath-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell filepath-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-prof-1.4.2.1.13-1.5.aarch64.rpm"
RPM_HASH = "03e3904dc4e75f8034fcfd1dec28557635f9ef22ba9563c20ab9eab82c2e47f175d5330ed9f5b90c31f6ddc32f2ddf42d8d90279f5a19d3ff4a4025a51e3867f"

RPROVIDES:${PN} += "ghc-filepath-bytestring-prof \
ghc-prof-filepath-bytestring-1.4.2.1.13-KgttGjs0pYw2aEgCzIFOnB"

RDEPENDS:${PN} += "ghc-filepath-bytestring-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-unix-2.7.3"

inherit rpm
