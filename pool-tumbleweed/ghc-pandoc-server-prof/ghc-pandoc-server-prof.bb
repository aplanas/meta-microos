SUMMARY = "Haskell pandoc-server profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-server profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-prof-0.1.0.1-1.4.aarch64.rpm"
RPM_HASH = "25181cccd478df84115aeb424f6801a43cc7b045028349a78e96393bce53f3721592956b6221144efbd8bdb06e801a42a079883ba1e21bcae57112423c9876ac"

RPROVIDES:${PN} += "ghc-pandoc-server-prof \
ghc-prof-pandoc-server-0.1.0.1-BWQTQymjTXK66ou47YYzdF"

RDEPENDS:${PN} += "ghc-pandoc-server-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-prof-pandoc-3.1.3-ImQr97Zc2bP55LDbAec3vO \
ghc-prof-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-prof-servant-server-0.19.2-45Ad5DaXbfZ3KJksjW89lv \
ghc-prof-skylighting-0.13.4-5T99F0BkgIQGejRNYUpHqn \
ghc-prof-text-2.0.2 \
ghc-prof-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9"

inherit rpm
