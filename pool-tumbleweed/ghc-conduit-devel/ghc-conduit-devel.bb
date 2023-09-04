SUMMARY = "Haskell conduit library development files"
DESCRIPTION = "This package provides the Haskell conduit library development files."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-devel-1.3.5-1.7.aarch64.rpm"
RPM_HASH = "7ec72b6400149a3e6b41bea2cec59388330903404a9a951f84968fa8765252822cfef554d1c5b2ce065fd5ef63b00e28690925e1bf7f3a253f409ca52772ff1f"

RPROVIDES:${PN} += "ghc-conduit-devel \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-conduit \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW \
ghc-devel-mtl-2.2.2 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
