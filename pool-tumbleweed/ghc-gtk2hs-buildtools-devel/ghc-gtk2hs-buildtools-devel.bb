SUMMARY = "Haskell gtk2hs-buildtools library development files"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library development files."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-gtk2hs-buildtools-devel-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "3c31c3e6de04a523d9f6007028c9b3ee0c81d72fa4e238f71fdc7a89e124e9e90990cc66d5c09de85282f24a67d06cc0536a4ab5fc3c6020a479d3959a0b867f"

RPROVIDES:${PN} += "ghc-devel-gtk2hs-buildtools-0.13.10.0-GMmATWROlNJH1zTcL3EPcc \
ghc-gtk2hs-buildtools-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.16.0 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-gtk2hs-buildtools \
gtk2hs-buildtools"

inherit rpm
