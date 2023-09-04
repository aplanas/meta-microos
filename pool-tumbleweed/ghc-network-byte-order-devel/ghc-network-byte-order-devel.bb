SUMMARY = "Haskell network-byte-order library development files"
DESCRIPTION = "This package provides the Haskell network-byte-order library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-devel-0.1.6-4.3.aarch64.rpm"
RPM_HASH = "2576e333d2acd53c1fb4a32efdf2451abf626d89b99b8063437c77b37de55859c48024eeb10786fc20d96b7ddd4da743ce56aeced7afe48be94a4a72a9ebe74c"

RPROVIDES:${PN} += "ghc-devel-network-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs \
ghc-network-byte-order-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-network-byte-order"

inherit rpm
