SUMMARY = "Haskell commonmark-pandoc profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-prof-0.2.1.3-2.5.aarch64.rpm"
RPM_HASH = "e622fedfc5498f1a5a8d22452898caea38ee5986998f04da9c0a51bd2ff94aae15138b2407b8a3277f70c9163cae0128a17e6e5833b982fbbdabb5e2087dfeae"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-prof \
ghc-prof-commonmark-pandoc-0.2.1.3-5icm69shxRz6xfjspkSdL7"

RDEPENDS:${PN} += "ghc-commonmark-pandoc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-prof-commonmark-extensions-0.2.3.5-GeNUJwJZ0WZ7BXjQ8SYvXo \
ghc-prof-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-prof-text-2.0.2"

inherit rpm
