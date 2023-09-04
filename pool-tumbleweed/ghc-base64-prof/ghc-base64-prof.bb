SUMMARY = "Haskell base64 profiling library"
DESCRIPTION = "This package provides the Haskell base64 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-prof-0.4.2.4-3.9.aarch64.rpm"
RPM_HASH = "95f4fc38c7c8f926df4389aee81121ce9b0a14f4e651129501d97ebeb386d29c23be764baf656f8fedd8b5d924c7e84d1fb7f8a352ccccffbc770c331423a699"

RPROVIDES:${PN} += "ghc-base64-prof \
ghc-prof-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S"

RDEPENDS:${PN} += "ghc-base64-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez"

inherit rpm
