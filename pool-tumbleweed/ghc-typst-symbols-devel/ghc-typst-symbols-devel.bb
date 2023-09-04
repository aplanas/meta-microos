SUMMARY = "Haskell typst-symbols library development files"
DESCRIPTION = "This package provides the Haskell typst-symbols library development files."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-devel-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "0f5c9fa9ac4f4be4d39c11398018e978ba8892354824a4313db23079a39a48ce47bda8d79a4ca2506085d5497aec147020838d748d41785ac3f532391922a3e2"

RPROVIDES:${PN} += "ghc-devel-typst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB \
ghc-typst-symbols-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-text-2.0.2 \
ghc-typst-symbols"

inherit rpm
