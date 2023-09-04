SUMMARY = "Haskell criterion library development files"
DESCRIPTION = "This package provides the Haskell criterion library development files."
LICENSE = "BSD-2-Clause"

PV = "1.6.3.0"

RPM_NAME = "ghc-criterion-devel-1.6.3.0-1.2.aarch64.rpm"
RPM_HASH = "cef5243b1ad9657a21ec25cdb9457c76827616775fc654638ad318ab6eec70505a43da528a6f7ffb8cde698646cc75cf644347b6a648703fe7a885b3a9ddb97c"

RPROVIDES:${PN} += "ghc-criterion-devel \
ghc-devel-criterion-1.6.3.0-EGLIpy9JvSz7CkKKbD6QBe"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-criterion \
ghc-devel-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW \
ghc-devel-binary-0.8.9.1 \
ghc-devel-binary-orphans-1.0.4.1-8AxRlqguR7DABM6SJeuldT \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-devel-code-page-0.2.1-FtqibIt49dG4EHKj0zD5sM \
ghc-devel-containers-0.6.7 \
ghc-devel-criterion-measurement-0.2.1.0-2AOdhJohtCNDtfUJjSL1gP \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-js-chart-2.9.4.1-JVxU4FDcB7p8n92cFFYHGl \
ghc-devel-microstache-1.0.2.3-KBculmnRicB9ztvZCFpDOs \
ghc-devel-mtl-2.2.2 \
ghc-devel-mwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp \
ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-devel-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-devel-statistics-0.16.2.0-Dp1JycEUxrUOwl2iaVmzC \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr"

inherit rpm
