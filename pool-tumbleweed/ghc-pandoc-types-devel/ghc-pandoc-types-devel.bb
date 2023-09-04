SUMMARY = "Haskell pandoc-types library development files"
DESCRIPTION = "This package provides the Haskell pandoc-types library development files."
LICENSE = "GPL-2.0-only"

PV = "1.23.1"

RPM_NAME = "ghc-pandoc-types-devel-1.23.1-1.1.aarch64.rpm"
RPM_HASH = "df5716d7789bc87f354463a6f9b75537e0ed3244e41a5f3b91e231db101a5aa14aaf4b49a74d201df6d6fb6a75cf5d43af9e1f74005eae8299d327d0ad993799"

RPROVIDES:${PN} += "ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-pandoc-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-pandoc-types"

inherit rpm
