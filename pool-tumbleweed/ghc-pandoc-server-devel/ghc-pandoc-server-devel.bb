SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-devel-0.1.0.1-1.5.aarch64.rpm"
RPM_HASH = "7cca6aca497bfc545ed930184fe0cf6e37f9ae4e05eb591067b996d9d677edcb94fcf22a7a877ea03a0c86ef8a3b90368e3e6a4cdf65173dfd9f5e9937647711"

RPROVIDES:${PN} += "ghc-devel-pandoc-server-0.1.0.1-EEBmZSAnUOe2OoSU1Xwtfy \
ghc-pandoc-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-devel-pandoc-3.1.3-55OY79jb6yp7kweb38lcUZ \
ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-devel-servant-server-0.19.2-45Ad5DaXbfZ3KJksjW89lv \
ghc-devel-skylighting-0.13.4.1-CU1AlEko5yK2gCD1OmtnCm \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9 \
ghc-pandoc-server"

inherit rpm
