SUMMARY = "Haskell commonmark-pandoc library development files"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-devel-0.2.1.3-2.5.aarch64.rpm"
RPM_HASH = "57e1d2046c7ee921fb07a47f58b8ba5504da2ee2d58c2da1b17fab9709151f42518a71f9547401e71c14dce5ddfac3be063fc8e6e8209bd785a459d12eb6e2cb"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-devel \
ghc-devel-commonmark-pandoc-0.2.1.3-5icm69shxRz6xfjspkSdL7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-pandoc \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-devel-commonmark-extensions-0.2.3.5-GeNUJwJZ0WZ7BXjQ8SYvXo \
ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-devel-text-2.0.2"

inherit rpm
