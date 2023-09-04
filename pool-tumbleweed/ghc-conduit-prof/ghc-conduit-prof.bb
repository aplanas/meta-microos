SUMMARY = "Haskell conduit profiling library"
DESCRIPTION = "This package provides the Haskell conduit profiling library."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-prof-1.3.5-1.7.aarch64.rpm"
RPM_HASH = "745e91197314e7f0663b9bf49462d70e10b2fcf9e937e9c421f59678b8471250d729641f7ced12a2aebda095715b6601a25a714757d5a8ab9b7351573be32f88"

RPROVIDES:${PN} += "ghc-conduit-prof \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX"

RDEPENDS:${PN} += "ghc-conduit-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW \
ghc-prof-mtl-2.2.2 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
