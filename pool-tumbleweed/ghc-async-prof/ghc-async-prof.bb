SUMMARY = "Haskell async profiling library"
DESCRIPTION = "This package provides the Haskell async profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-prof-2.2.4-4.4.aarch64.rpm"
RPM_HASH = "ebc905f3b0e97b7c94ced8eddf4502c6050927994f69a33434bb6e5e05cfb7b2fad3b383b3e3e3661ea82e153f7914a558fac9947e037b5497c1eb8be6b1bfb2"

RPROVIDES:${PN} += "ghc-async-prof \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI"

RDEPENDS:${PN} += "ghc-async-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-stm-2.5.1.0"

inherit rpm
