SUMMARY = "Haskell cookie profiling library"
DESCRIPTION = "This package provides the Haskell cookie profiling library."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-prof-0.4.6-2.2.aarch64.rpm"
RPM_HASH = "beebb2a18c6d94190ecd7f29d83c502b2998ea0695d10cdda216c02c725d6cb1c060e0ff28311e25ef6c5557cad1b0e7c9f7ad726248a3fdebd53c7d4f5cd87a"

RPROVIDES:${PN} += "ghc-cookie-prof \
ghc-cookie-prof(aarch-64) \
ghc-prof(cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE)"

RDEPENDS:${PN} += "ghc-cookie-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2)"

inherit rpm
