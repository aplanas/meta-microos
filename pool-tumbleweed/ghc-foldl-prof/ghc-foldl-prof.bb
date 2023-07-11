SUMMARY = "Haskell foldl profiling library"
DESCRIPTION = "This package provides the Haskell foldl profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.14"

RPM_NAME = "ghc-foldl-prof-1.4.14-2.6.aarch64.rpm"
RPM_HASH = "5cdb6e749958401c4011e369fc38d3b58438cae0fdd7a543be692f49b36740c6f123ffac2dfc51f3365507bdf54aa8cbb7a6d2493282aa1771f4a45ef122d057"

RPROVIDES:${PN} += "ghc-foldl-prof \
ghc-prof-foldl-1.4.14-6AA7lw3dsEK1uUeCGro40c"

RDEPENDS:${PN} += "ghc-foldl-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
