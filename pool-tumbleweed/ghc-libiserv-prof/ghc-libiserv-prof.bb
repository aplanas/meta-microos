SUMMARY = "Haskell libiserv profiling library"
DESCRIPTION = "This package provides the Haskell libiserv profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-prof-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "701e7347a2f36b1c7b346f0961c324d0381ce2d7d74cbec2f0f2d6c51c9ce142612890120889c6094db3ec9dbe3704301d7f5d51112f9d65a40aa7f37c70c7ff"

RPROVIDES:${PN} += "ghc-libiserv-prof \
ghc-prof-libiserv-9.4.5"

RDEPENDS:${PN} += "ghc-libiserv-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghci-9.4.5 \
ghc-prof-unix-2.7.3"

inherit rpm
