SUMMARY = "Haskell splitmix profiling library"
DESCRIPTION = "This package provides the Haskell splitmix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-prof-0.1.0.4-4.3.aarch64.rpm"
RPM_HASH = "b46712ea425e3b38426c08fe6b54a57d7f33d5c34c675a17d5f58f3a036d7f6fbbf0af1c2abe3dfdd998569b0f4e15fc37e378cf9d78b11b6a0705f059956fe9"

RPROVIDES:${PN} += "ghc-prof(splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe) \
ghc-splitmix-prof \
ghc-splitmix-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-splitmix-devel"

inherit rpm
