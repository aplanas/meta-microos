SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.3"

RPM_NAME = "ghc-pandoc-server-devel-0.1.0.3-1.1.aarch64.rpm"
RPM_HASH = "b1e7fbaa064bda35a92b73a32ca5da34e785f07ad1b7b599327747a3a5ee32eb8ebfcaa04c36b8e83c807508044af302d834806ac08af917bfa97beab0b5fed5"

RPROVIDES:${PN} += "ghc-devel-pandoc-server-0.1.0.3-AhXF1lRMuRZJmknTamhUUB \
ghc-pandoc-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-devel-pandoc-3.1.3-vrz2YBr4KqIJ1o9bFBvzp \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-servant-server-0.19.2-7mZwAKg13bTKiqPrqXFWN4 \
ghc-devel-skylighting-0.13.4.1-154hDBm9lstJ5eMNDkHcA5 \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i \
ghc-pandoc-server"

inherit rpm
