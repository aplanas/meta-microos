SUMMARY = "Haskell unicode-data library development files"
DESCRIPTION = "This package provides the Haskell unicode-data library development files."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-devel-0.4.0.1-3.6.aarch64.rpm"
RPM_HASH = "99f49a4a3dbb54f5905970a1b327f08189b4cb257169d487ee2605180a789c283caaa533f200f32bd06669da06d8c6ae417d5ae2d2b2af15ee61af4c69ef173b"

RPROVIDES:${PN} += "ghc-devel-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-unicode-data-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-unicode-data"

inherit rpm
