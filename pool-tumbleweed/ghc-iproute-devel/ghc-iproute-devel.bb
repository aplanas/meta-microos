SUMMARY = "Haskell iproute library development files"
DESCRIPTION = "This package provides the Haskell iproute library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-devel-1.7.12-2.7.aarch64.rpm"
RPM_HASH = "b150c0dd2fbfa9f61ce621d575a7e8de5b512624226956aacb04a2f701671c47162e541678af2d7f76b140cf692b303d7dc526a63a59beaff7a63cdfcda3ef19"

RPROVIDES:${PN} += "ghc-devel-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD \
ghc-iproute-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-appar-0.1.8-JYpyJYPkUOgKorqU8WSWRv \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-iproute"

inherit rpm
