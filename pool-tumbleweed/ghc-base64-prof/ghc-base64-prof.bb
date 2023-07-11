SUMMARY = "Haskell base64 profiling library"
DESCRIPTION = "This package provides the Haskell base64 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-prof-0.4.2.4-3.6.aarch64.rpm"
RPM_HASH = "671c060153963d51ea3b23b5646b7e8154709cdc1f11da369fd1c61157c2e266ece9b84aaf58d6a973711a32919291069a00471b87cba7e897d8164ef22d439d"

RPROVIDES:${PN} += "ghc-base64-prof \
ghc-prof-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV"

RDEPENDS:${PN} += "ghc-base64-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2"

inherit rpm
