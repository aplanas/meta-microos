SUMMARY = "Haskell lifted-base library development files"
DESCRIPTION = "This package provides the Haskell lifted-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-devel-0.2.3.12-8.8.aarch64.rpm"
RPM_HASH = "e4730154a786e2db511fc12b97dfd82ce6251c205b6b42030b7cb74471e7c9d0e4930bd81a2de73d0c78c73780a98f59aeb0cbab3138d88941d2669d6e52014a"

RPROVIDES:${PN} += "ghc-devel-lifted-base-0.2.3.12-8AMs8PuCeaLKJwoieZv4GI \
ghc-lifted-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-lifted-base"

inherit rpm
