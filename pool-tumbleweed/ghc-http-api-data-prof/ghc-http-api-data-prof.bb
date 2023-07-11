SUMMARY = "Haskell http-api-data profiling library"
DESCRIPTION = "This package provides the Haskell http-api-data profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-prof-0.5-4.1.aarch64.rpm"
RPM_HASH = "95125f56b4f8a1b549578c355f859e5df5342a44baa639641501c4efdfdaab2d99a7b5a7748846bd75f27261723b3fce9809763c83e4534576b67882586a4eb4"

RPROVIDES:${PN} += "ghc-http-api-data-prof \
ghc-prof-http-api-data-0.5-V3iAwM0FHG5XKNP6QkA7J"

RDEPENDS:${PN} += "ghc-http-api-data-devel \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-attoparsec-iso8601-1.1.0.0-7warWbAa4NQL4IDzyErxXZ \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-text-2.0.2 \
ghc-prof-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM"

inherit rpm
