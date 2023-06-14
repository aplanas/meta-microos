SUMMARY = "Haskell assoc profiling library"
DESCRIPTION = "This package provides the Haskell assoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-assoc-prof-1.0.2-7.3.aarch64.rpm"
RPM_HASH = "3d7765f2e5af5b0093ea769f71f7bb2d7ed9b736a2eb67ec4b7ea27d12311269af5787bc5c4e9053df21fa38689f3283bfbc8817afcb89d46a46afa5be307fc4"

RPROVIDES:${PN} += "ghc-assoc-prof \
ghc-prof-assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7"

RDEPENDS:${PN} += "ghc-assoc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
