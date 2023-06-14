SUMMARY = "Haskell xml profiling library"
DESCRIPTION = "This package provides the Haskell xml profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-prof-1.3.14-13.3.aarch64.rpm"
RPM_HASH = "632836cb41b1780b7ef998d6f86c089cf18ca23eeca15557e170fc8d35f94e136ab06f423c41a7984c6ad8cc2cf731ec0537b44e24a893a9965043b26abcdbe9"

RPROVIDES:${PN} += "ghc-prof-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-xml-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2 \
ghc-xml-devel"

inherit rpm
