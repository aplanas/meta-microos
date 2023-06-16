SUMMARY = "Haskell network-byte-order library development files"
DESCRIPTION = "This package provides the Haskell network-byte-order library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-devel-0.1.6-4.2.aarch64.rpm"
RPM_HASH = "f0de77b84fc94388a575b7b7d42f329d7d4539caa9da2ae374351139df195f1b5358a557bd8f418e8e68a46a6c686b938b597a0282cd4fbf20123b2f04a0d9d7"

RPROVIDES:${PN} += "ghc-devel-network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO \
ghc-network-byte-order-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-network-byte-order"

inherit rpm
