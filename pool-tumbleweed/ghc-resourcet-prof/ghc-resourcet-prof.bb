SUMMARY = "Haskell resourcet profiling library"
DESCRIPTION = "This package provides the Haskell resourcet profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-prof-1.2.6-2.8.aarch64.rpm"
RPM_HASH = "edfe7cd0b9c65a88d3fd0b3b6457c05b63dcfdea645646ccd6aec2d6a754a30411afd133c367cf6ee2d8ba2c1f2dbb94fc7b9503faba26c7ac41acd2e34f61d4"

RPROVIDES:${PN} += "ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-resourcet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-mtl-2.2.2 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-resourcet-devel"

inherit rpm
