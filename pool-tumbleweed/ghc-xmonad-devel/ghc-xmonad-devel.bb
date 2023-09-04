SUMMARY = "Haskell xmonad library development files"
DESCRIPTION = "This package provides the Haskell xmonad library development files."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-devel-0.17.2-1.8.aarch64.rpm"
RPM_HASH = "2dfbb0b74cb9d51bf9679435f57e2e662924fea42ea82725629901f285f6b082a4af43d58a9f0ce89f4d5959d45b12f163dfb426d2ba09e0b3bea4876e107ae2"

RPROVIDES:${PN} += "ghc-devel-xmonad-0.17.2-5u18H8h5WrJ4e8esV9nzjE \
ghc-xmonad-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-setlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-xmonad"

inherit rpm
