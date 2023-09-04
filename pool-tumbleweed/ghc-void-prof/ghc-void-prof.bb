SUMMARY = "Haskell void profiling library"
DESCRIPTION = "This package provides the Haskell void profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-prof-0.7.3-6.3.aarch64.rpm"
RPM_HASH = "99d1b10c27238b7dcf6aff3af0a58b6009458a1459398ad0a590c6fa4a1034734b1ea8298d8105c3220d45b8ea12e9be4d46446accbb1a4ebca8effb7abea158"

RPROVIDES:${PN} += "ghc-prof-void-0.7.3-GhXmDKlBHl0LbXoxVMxAU0 \
ghc-void-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-void-devel"

inherit rpm
