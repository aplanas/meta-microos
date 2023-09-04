SUMMARY = "Haskell criterion profiling library"
DESCRIPTION = "This package provides the Haskell criterion profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.6.3.0"

RPM_NAME = "ghc-criterion-prof-1.6.3.0-1.2.aarch64.rpm"
RPM_HASH = "e631bc503397c8bf3c42826714fb49a6a4d00b7d177ab96b3d0e2c72521216bc7d540b8358db64fb6cc8cf23aea023a08af994f959666d9ef60113121262bc67"

RPROVIDES:${PN} += "ghc-criterion-prof \
ghc-prof-criterion-1.6.3.0-EGLIpy9JvSz7CkKKbD6QBe"

RDEPENDS:${PN} += "ghc-criterion-devel \
ghc-prof-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW \
ghc-prof-binary-0.8.9.1 \
ghc-prof-binary-orphans-1.0.4.1-8AxRlqguR7DABM6SJeuldT \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-prof-code-page-0.2.1-FtqibIt49dG4EHKj0zD5sM \
ghc-prof-containers-0.6.7 \
ghc-prof-criterion-measurement-0.2.1.0-2AOdhJohtCNDtfUJjSL1gP \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-js-chart-2.9.4.1-JVxU4FDcB7p8n92cFFYHGl \
ghc-prof-microstache-1.0.2.3-KBculmnRicB9ztvZCFpDOs \
ghc-prof-mtl-2.2.2 \
ghc-prof-mwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-prof-statistics-0.16.2.0-Dp1JycEUxrUOwl2iaVmzC \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr"

inherit rpm
