SUMMARY = "Haskell monad-logger profiling library"
DESCRIPTION = "This package provides the Haskell monad-logger profiling library."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-prof-0.3.40-1.8.aarch64.rpm"
RPM_HASH = "1229992d3deee3013c2ee4821a1b542706df89837045b0fd4a4fc6e02bac5c80ed0f4f1642e0c60133e80eafb6077e1320075cdf275f5537e7ad64c7d741126e"

RPROVIDES:${PN} += "ghc-monad-logger-prof \
ghc-prof-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s"

RDEPENDS:${PN} += "ghc-monad-logger-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-prof-exceptions-0.10.5 \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-prof-lifted-base-0.2.3.12-8AMs8PuCeaLKJwoieZv4GI \
ghc-prof-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-prof-monad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-stm-2.5.1.0 \
ghc-prof-stm-chans-3.0.0.9-HC5DzDy937dJnRBWxlJfuc \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES"

inherit rpm
