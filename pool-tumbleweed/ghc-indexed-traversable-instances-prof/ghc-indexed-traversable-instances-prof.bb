SUMMARY = "Haskell indexed-traversable-instances profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-prof-0.1.1.2-1.6.aarch64.rpm"
RPM_HASH = "b38543f50011138ff271efaedfeeae507acdac9c03cb19619da231c3d56a5d489ce2176bae9406a4d14e61876d8416322b7151f9601d55d4f8acfd87d7b5d83a"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-prof \
ghc-prof-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ"

RDEPENDS:${PN} += "ghc-indexed-traversable-instances-devel \
ghc-prof-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI \
ghc-prof-base-4.17.2.0 \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
