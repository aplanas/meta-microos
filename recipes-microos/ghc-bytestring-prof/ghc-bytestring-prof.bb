SUMMARY = "Haskell bytestring profiling library"
DESCRIPTION = "This package provides the Haskell bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-prof-0.11.4.0-1.1.aarch64.rpm"
RPM_HASH = "39a912c8958109df876460078a9d593dbabe045e8fad49a58b1e5e86fd62bcba7e5ba07327b0a23c96fc3aec177846406875b7aef55537aca9b09c8c06bc3ace"

RPROVIDES:${PN} += "ghc-bytestring-prof ghc-bytestring-prof(aarch-64) ghc-prof(bytestring-0.11.4.0)"
RDEPENDS:${PN} += "ghc-bytestring-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
