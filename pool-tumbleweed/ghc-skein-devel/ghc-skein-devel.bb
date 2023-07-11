SUMMARY = "Haskell skein library development files"
DESCRIPTION = "This package provides the Haskell skein library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-devel-1.0.9.4-4.3.aarch64.rpm"
RPM_HASH = "369d156591a30d9bcb66ca9a74df8e43715dbb100da7234b9cd7e40abd7c6b6ffe1a3f21c31d8e6329892dbfdf7319de593e062cd066eb7b9f400e3a990f0ca1"

RPROVIDES:${PN} += "ghc-devel-skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO \
ghc-skein-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-skein"

inherit rpm
