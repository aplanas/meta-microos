SUMMARY = "Haskell indexed-traversable-instances library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library \
development files."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-devel-0.1.1.2-1.6.aarch64.rpm"
RPM_HASH = "1288c02ec2f35119867cd2ed911d4e477ab5a1fac68b881cf10c6b0fe8a267dbd0f5d6b40fef918c329f1c5650c08c322d8d999699f8df5d68aea5ffe669f8d1"

RPROVIDES:${PN} += "ghc-devel-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-indexed-traversable-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI \
ghc-devel-base-4.17.2.0 \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-indexed-traversable-instances"

inherit rpm
