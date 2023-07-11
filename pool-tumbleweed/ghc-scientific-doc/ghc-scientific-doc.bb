SUMMARY = "Haskell scientific library documentation"
DESCRIPTION = "This package provides the Haskell scientific library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-doc-0.3.7.0-5.6.noarch.rpm"
RPM_HASH = "b061807f7c99b7338ab2b7fce2f77fe694db2e34ad5da3a5c02e2ab01457cf34d44304f7ba7e94f12f71a10951dd29abbe60260e57990a908c0dd3ae75e59e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-scientific-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
