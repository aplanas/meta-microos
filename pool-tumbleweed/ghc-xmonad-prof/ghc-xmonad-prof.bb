SUMMARY = "Haskell xmonad profiling library"
DESCRIPTION = "This package provides the Haskell xmonad profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-prof-0.17.2-1.8.aarch64.rpm"
RPM_HASH = "f95fd5a5f82c295c143bdd8a4ff781e0e870d71e6c172ede96e2e55c9bcdbc9814f362ef4b8ed0f79e0f2f1284249ca807b5c5bef88056a77d8e0c428420694b"

RPROVIDES:${PN} += "ghc-prof-xmonad-0.17.2-5u18H8h5WrJ4e8esV9nzjE \
ghc-xmonad-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-setlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-xmonad-devel"

inherit rpm
