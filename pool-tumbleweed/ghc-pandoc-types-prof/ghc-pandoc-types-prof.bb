SUMMARY = "Haskell pandoc-types profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-types profiling library."
LICENSE = "GPL-2.0-only"

PV = "1.23.1"

RPM_NAME = "ghc-pandoc-types-prof-1.23.1-1.1.aarch64.rpm"
RPM_HASH = "e4aa54ce7ab0abbcd6eca4adb2a591c6b800fc0e949ebe9c30ed5cf705c2df9be38f9a32537068b7d34d867c29b21d9eecb9b33f36594c4b807735abd746ed46"

RPROVIDES:${PN} += "ghc-pandoc-types-prof \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc"

RDEPENDS:${PN} += "ghc-pandoc-types-devel \
ghc-prof-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
