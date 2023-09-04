SUMMARY = "Haskell some profiling library"
DESCRIPTION = "This package provides the Haskell some profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-prof-1.0.5-1.8.aarch64.rpm"
RPM_HASH = "5b34f699b66b0c90f8f4db2a9c12da0a2f522257f984b639ea0fb61c3def24c0d7d969eee6052ed6ee64c2dec3c1f3d77a47ab8afc85fd84f05cb710a4bb6dba"

RPROVIDES:${PN} += "ghc-prof-some-1.0.5-EryUniFNYOB2ktd7SoyKUW \
ghc-some-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-some-devel"

inherit rpm
