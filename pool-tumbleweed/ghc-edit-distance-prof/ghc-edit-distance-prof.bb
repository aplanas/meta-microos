SUMMARY = "Haskell edit-distance profiling library"
DESCRIPTION = "This package provides the Haskell edit-distance profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-prof-0.2.2.1-13.3.aarch64.rpm"
RPM_HASH = "4bcc5d4ae3c8cc6413fa96afac41b99ddd58d8947a01445a3674329daae744632bc5287fe4ba20e54d10dda05f0d4e63a8e06b9aa104a20fe4651c5426e3db21"

RPROVIDES:${PN} += "ghc-edit-distance-prof \
ghc-edit-distance-prof(aarch-64) \
ghc-prof(edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu)"
RDEPENDS:${PN} += "ghc-edit-distance-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o)"

inherit rpm
