SUMMARY = "Haskell monad-logger library development files"
DESCRIPTION = "This package provides the Haskell monad-logger library development files."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-devel-0.3.40-1.8.aarch64.rpm"
RPM_HASH = "f7f4210e1005ccb2e211fec7319dac0b3e8290bb5e1ab53d573c7c84ffd28647ff56a725e1a29debe31cbca05fa33ac84b86c6bd82ac9fe5c010e3640f4867dd"

RPROVIDES:${PN} += "ghc-devel-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-monad-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-exceptions-0.10.5 \
ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-devel-lifted-base-0.2.3.12-8AMs8PuCeaLKJwoieZv4GI \
ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-devel-monad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-stm-2.5.1.0 \
ghc-devel-stm-chans-3.0.0.9-HC5DzDy937dJnRBWxlJfuc \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-monad-logger"

inherit rpm
