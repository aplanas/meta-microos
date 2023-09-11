SUMMARY = "Haskell pandoc-server profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-server profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.3"

RPM_NAME = "ghc-pandoc-server-prof-0.1.0.3-1.1.aarch64.rpm"
RPM_HASH = "9700315844d4dd40f1e1697927fecb283d9bbd0a233c55ba4591c4fb30170be6e1da52c8b843464cf83064236160b4ef27c13e07c353f5db9b29d2a2355ad018"

RPROVIDES:${PN} += "ghc-pandoc-server-prof \
ghc-prof-pandoc-server-0.1.0.3-AhXF1lRMuRZJmknTamhUUB"

RDEPENDS:${PN} += "ghc-pandoc-server-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-prof-pandoc-3.1.3-vrz2YBr4KqIJ1o9bFBvzp \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-servant-server-0.19.2-7mZwAKg13bTKiqPrqXFWN4 \
ghc-prof-skylighting-0.13.4.1-154hDBm9lstJ5eMNDkHcA5 \
ghc-prof-text-2.0.2 \
ghc-prof-unicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i"

inherit rpm
