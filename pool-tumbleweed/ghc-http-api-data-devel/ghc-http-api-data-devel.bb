SUMMARY = "Haskell http-api-data library development files"
DESCRIPTION = "This package provides the Haskell http-api-data library development files."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-devel-0.5-4.1.aarch64.rpm"
RPM_HASH = "728c8c4ca398a3db08a0f05c86ca42a750302fdbf636c3ac634865946e6df5377c2b62348ff257dab0a7357efbb1f4158899a10f8e523e5db50cf55e32e457d7"

RPROVIDES:${PN} += "ghc-devel-http-api-data-0.5-V3iAwM0FHG5XKNP6QkA7J \
ghc-http-api-data-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-attoparsec-iso8601-1.1.0.0-7warWbAa4NQL4IDzyErxXZ \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-text-2.0.2 \
ghc-devel-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-http-api-data"

inherit rpm
