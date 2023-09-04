SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.2"

RPM_NAME = "ghc-pandoc-server-devel-0.1.0.2-1.2.aarch64.rpm"
RPM_HASH = "0bb0bcc7ceea9dd864d5be14d47abbd79212a776e76511ed14727c448a99babba615c2ef8dc0a9ee18231b7654ca06b0a4d445d8307b0fd7d4f963c86c2b551d"

RPROVIDES:${PN} += "ghc-devel-pandoc-server-0.1.0.2-I6Hiy1wFBK737EtmGUgIxB \
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
ghc-devel-pandoc-3.1.3-DH3GNUoUN8j8vzRMH3Lho2 \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-servant-server-0.19.2-7444o9ZjHDc4tKFECJOEz2 \
ghc-devel-skylighting-0.13.4.1-3SOo9dVatPFFF0udKykjgy \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i \
ghc-pandoc-server"

inherit rpm
