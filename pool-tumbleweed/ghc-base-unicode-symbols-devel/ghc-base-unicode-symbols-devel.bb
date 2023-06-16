SUMMARY = "Haskell base-unicode-symbols library development files"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-devel-0.2.4.2-1.2.aarch64.rpm"
RPM_HASH = "44149a04defa7e0f6047427867124168f6b61daf501952e739a9717b07dc30fb0ca73d0d4a030e339c10ea03d8d292be4e3cab221700a9f92aef88e8986ea08d"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-devel \
ghc-devel-base-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-unicode-symbols \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
