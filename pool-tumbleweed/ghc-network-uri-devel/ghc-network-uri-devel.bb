SUMMARY = "Haskell network-uri library development files"
DESCRIPTION = "This package provides the Haskell network-uri library development files."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-devel-2.6.4.2-2.8.aarch64.rpm"
RPM_HASH = "48c64e5034404a36edeb6d9cfd5f690d49fa1006e35cc65fd6a7ccba69b58e9335ed0abba2945cffb7033be5e404b5ee61ce15b89518c6906c843827401de640"

RPROVIDES:${PN} += "ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-network-uri-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS \
ghc-network-uri"

inherit rpm
