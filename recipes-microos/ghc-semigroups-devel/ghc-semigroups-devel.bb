SUMMARY = "Haskell semigroups library development files"
DESCRIPTION = "This package provides the Haskell semigroups library development files."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-devel-0.20-2.2.aarch64.rpm"
RPM_HASH = "233784cc2b9a299f02115c1bfcaed5b26b98ed143386df980bc6f4769325919b667340673ab26597a9fa27efdfaa3a66e06c84619e22691a3cb7729626b35427"

RPROVIDES:${PN} += "ghc-devel(semigroups-0.20-KtsaS4jNcGkoC9puVZ6vB) ghc-semigroups-devel ghc-semigroups-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-semigroups"

inherit rpm
