SUMMARY = "Haskell pandoc-server profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-server profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.2"

RPM_NAME = "ghc-pandoc-server-prof-0.1.0.2-1.2.aarch64.rpm"
RPM_HASH = "62837174e641090d277ca0fba3580ef5309c8b866ceddd14766cac0d0bf0747cf24f65c5f6a6f1f275e4394bdda9af74e8521cf010712427d0c8895b646f3c38"

RPROVIDES:${PN} += "ghc-pandoc-server-prof \
ghc-prof-pandoc-server-0.1.0.2-I6Hiy1wFBK737EtmGUgIxB"

RDEPENDS:${PN} += "ghc-pandoc-server-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-prof-pandoc-3.1.3-DH3GNUoUN8j8vzRMH3Lho2 \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-servant-server-0.19.2-7444o9ZjHDc4tKFECJOEz2 \
ghc-prof-skylighting-0.13.4.1-3SOo9dVatPFFF0udKykjgy \
ghc-prof-text-2.0.2 \
ghc-prof-unicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i"

inherit rpm
