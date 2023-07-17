SUMMARY = "Haskell filepattern profiling library"
DESCRIPTION = "This package provides the Haskell filepattern profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-prof-0.1.3-2.8.aarch64.rpm"
RPM_HASH = "dc95bb5de30027a5f888d38f56e561c776b8998c4b85fa0fa2cc5b3d4e67045cd0adc8c8a297552a97834e54e28c9d17b9f73aa95b59fac8dfe0d8bd6e5764b7"

RPROVIDES:${PN} += "ghc-filepattern-prof \
ghc-prof-filepattern-0.1.3-ZuemUYkhwGA1RPuLxzdA9"

RDEPENDS:${PN} += "ghc-filepattern-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-prof-filepath-1.4.2.2"

inherit rpm
