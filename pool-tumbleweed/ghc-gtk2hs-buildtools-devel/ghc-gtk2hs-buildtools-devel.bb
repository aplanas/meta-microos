SUMMARY = "Haskell gtk2hs-buildtools library development files"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library development files."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-gtk2hs-buildtools-devel-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "2814691134fd7b76bc9102eb87d2733be8942d4b5d10de8bf17e1d6fbfb48061e54ce04d7bb9e83d5e1767d8283a6262f12fa436f1023ad68d1d9dc1bd2bd661"

RPROVIDES:${PN} += "ghc-devel-gtk2hs-buildtools-0.13.10.0-DYkyEn9mhdVHic4axOCgFz \
ghc-gtk2hs-buildtools-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-gtk2hs-buildtools \
gtk2hs-buildtools"

inherit rpm
