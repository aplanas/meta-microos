SUMMARY = "Haskell attoparsec-iso8601 profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-prof-1.1.0.0-2.2.aarch64.rpm"
RPM_HASH = "57f438e7cf275fdcda2961fafc3ff4632369c7a426a86ca14a1c79acd999e0b1652e1922232da086658923e44db937767abb048ddb820e3482182c807bb475bc"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-prof \
ghc-attoparsec-iso8601-prof(aarch-64) \
ghc-prof(attoparsec-iso8601-1.1.0.0-2S5wwgpuLNfEy2BIFZOtUU)"

RDEPENDS:${PN} += "ghc-attoparsec-iso8601-devel \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82)"

inherit rpm
