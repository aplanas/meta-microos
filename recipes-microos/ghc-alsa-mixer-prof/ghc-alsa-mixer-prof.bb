SUMMARY = "Haskell alsa-mixer profiling library"
DESCRIPTION = "This package provides the Haskell alsa-mixer profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-prof-0.3.0-4.2.aarch64.rpm"
RPM_HASH = "a86846940bdec274b95010d95af4eab60b5b865446c9f1b7bb42be537c7357b2dc34ffaef2d635f542745569a741619be75b21c442eefdf986381d7bf0268f86"

RPROVIDES:${PN} += "ghc-alsa-mixer-prof \
ghc-alsa-mixer-prof(aarch-64) \
ghc-prof(alsa-mixer-0.3.0-Ff4FVP5Sg8l3sx20Z8BrVj)"
RDEPENDS:${PN} += "ghc-alsa-mixer-devel \
ghc-prof(alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg) \
ghc-prof(base-4.17.1.0) \
ghc-prof(unix-2.7.3)"

inherit rpm
