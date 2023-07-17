SUMMARY = "Haskell foldl library development files"
DESCRIPTION = "This package provides the Haskell foldl library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.15"

RPM_NAME = "ghc-foldl-devel-1.4.15-1.1.aarch64.rpm"
RPM_HASH = "a66d315cd146eae0692958baf3485c7398f61d8b83c43b1337c6f3dfc98959a8ab44cbd3e25ff553f4b1f212dadb4b6f90f6c95bf10db8607c7d3d5bd7f165e0"

RPROVIDES:${PN} += "ghc-devel-foldl-1.4.15-F8c77skQAn4DvWPbyzbRUi \
ghc-foldl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-foldl"

inherit rpm
