SUMMARY = "Haskell X11 profiling library"
DESCRIPTION = "This package provides the Haskell X11 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-prof-1.10.3-2.8.aarch64.rpm"
RPM_HASH = "ab7f8fe4d65a8b41f528e9364b7463355722a831ce08fe6354e4b47675b8aea1b48b851f4b4d2eacf3ded117f5a79f520d39333efbddf37db0c3693d5454e06f"

RPROVIDES:${PN} += "ghc-X11-prof \
ghc-prof-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4"

RDEPENDS:${PN} += "ghc-X11-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN"

inherit rpm
