SUMMARY = "Haskell timezone-olson library development files"
DESCRIPTION = "This package provides the Haskell timezone-olson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-devel-0.2.1-2.8.aarch64.rpm"
RPM_HASH = "8cdc811a98311ac827368945eb0ef08b0fb66524e38c1d42ed4223a3f5b55bcc1dc2954dfb955a161c826dec818e2b0c8374df516647b10630b566fb03eb562c"

RPROVIDES:${PN} += "ghc-devel-timezone-olson-0.2.1-50v8kH1zEHRIPtzATb6bsi \
ghc-timezone-olson-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e \
ghc-devel-time-1.12.2 \
ghc-devel-timezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA \
ghc-timezone-olson"

inherit rpm
