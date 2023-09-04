SUMMARY = "Haskell gtk2hs-buildtools profiling library"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools profiling library."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-gtk2hs-buildtools-prof-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "bd75fd11592e7a77fd82a1f49db6047ded2c1803708a5faf09ec6ee1a5490be4557ef6fa0cfc0a1ac9d249e5279a4894477efbd6bc0c036d6587bd1b5addafd2"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-prof \
ghc-prof-gtk2hs-buildtools-0.13.10.0-DYkyEn9mhdVHic4axOCgFz"

RDEPENDS:${PN} += "ghc-gtk2hs-buildtools-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.17.0 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k"

inherit rpm
