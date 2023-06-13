SUMMARY = "Haskell http-api-data profiling library"
DESCRIPTION = "This package provides the Haskell http-api-data profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-prof-0.5-3.2.aarch64.rpm"
RPM_HASH = "c61a00bae43e5a438f9b01ee24dd827706e2ddaa44e89e50624b5a7af1e654be0ec69d0ad9db64b15c0c57b44d32c9a8da26610a6e4ca680b6b29cb9578e5a43"

RPROVIDES:${PN} += "ghc-http-api-data-prof \
ghc-http-api-data-prof(aarch-64) \
ghc-prof(http-api-data-0.5-Ipkpz3wcjEIJthDto7snfd)"

RDEPENDS:${PN} += "ghc-http-api-data-devel \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(attoparsec-iso8601-1.1.0.0-2S5wwgpuLNfEy2BIFZOtUU) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(text-2.0.2) \
ghc-prof(time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM)"

inherit rpm
