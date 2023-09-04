SUMMARY = "Haskell timezone-olson profiling library"
DESCRIPTION = "This package provides the Haskell timezone-olson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-prof-0.2.1-2.8.aarch64.rpm"
RPM_HASH = "a413e1a98ce841c3e64498435b6507aa1ef7af142d2098687ccd1725c28fe84ec3556e87a879749a252c9b894983f2e067781e65a816862f6df8687b11c341dc"

RPROVIDES:${PN} += "ghc-prof-timezone-olson-0.2.1-50v8kH1zEHRIPtzATb6bsi \
ghc-timezone-olson-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e \
ghc-prof-time-1.12.2 \
ghc-prof-timezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA \
ghc-timezone-olson-devel"

inherit rpm
