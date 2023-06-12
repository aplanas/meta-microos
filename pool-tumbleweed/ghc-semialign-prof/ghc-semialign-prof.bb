SUMMARY = "Haskell semialign profiling library"
DESCRIPTION = "This package provides the Haskell semialign profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.0.1"

RPM_NAME = "ghc-semialign-prof-1.2.0.1-5.3.aarch64.rpm"
RPM_HASH = "6f6534ad7251ea617e6c08055204b73e7b67d401758739d3ac48aa29d8e7277804eb0ab058fe4f90dbd7477327e9dc57503c0f0d90e12c6a93f06bce1c1628b1"

RPROVIDES:${PN} += "ghc-prof(semialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m) \
ghc-semialign-prof \
ghc-semialign-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) \
ghc-prof(indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO) \
ghc-prof(semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(these-1.1.1.1-3POHYes25uBIW53bcrDd39) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-semialign-devel"

inherit rpm
